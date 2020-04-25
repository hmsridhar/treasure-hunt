package com.gigsky.treasurehunt.controller;


//import com.gigsky.treasurehunt.model.ResponseMessage;

import com.gigsky.treasurehunt.model.beans.UserDetails;
import com.gigsky.treasurehunt.model.dbbeans.ConfigurationKeyValues;
import com.gigsky.treasurehunt.model.dbbeans.ResponseMessage;
import com.gigsky.treasurehunt.model.dbbeans.User;
import com.gigsky.treasurehunt.service.ConfigurationKeyValuesService;
import com.gigsky.treasurehunt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

/**
 * Created by harshams on 20/04/2020
 */
@RestController
@RequestMapping(path = "")
//@CrossOrigin(origins = "*")
public class LoginController {

    @Autowired
    UserService userService;
    @Autowired
    ConfigurationKeyValuesService configurationKeyValuesService;
    private BCryptPasswordEncoder bcryptEncoder = new BCryptPasswordEncoder();

//    @PostMapping(value = "/login",produces = "application/json")
//    public ResponseEntity<?> login(@RequestBody User user){
//        ResponseMessage responseMessage = new ResponseMessage();
//        if(userService.isLoginValid(user)) {
//            responseMessage.setMessage("Login Successful");
//            return new ResponseEntity<>(responseMessage, HttpStatus.OK);
//        }
//        else {
//            responseMessage.setMessage("Invalid Credentails!");
//            return new ResponseEntity<>(responseMessage, HttpStatus.UNAUTHORIZED);
//        }
//    }

    @PostMapping(value = "/register/user",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> registerUser(@RequestBody User user){
        String password = bcryptEncoder.encode(user.getPassword());
//        user.setId(0L);
        user.setPassword(password);
        userService.addOrUpdateUser(user);
        ConfigurationKeyValues keyValue = new ConfigurationKeyValues();
        keyValue.setKey(user.getUsername()+"-stage");
        keyValue.setValue("1");
        configurationKeyValuesService.saveConfigKeyValue(keyValue);
        keyValue = new ConfigurationKeyValues();
        keyValue.setKey(user.getUsername()+"-day");
        keyValue.setValue("1");
        configurationKeyValuesService.saveConfigKeyValue(keyValue);
        keyValue = new ConfigurationKeyValues();
        keyValue.setKey(user.getUsername()+"-hint");
        keyValue.setValue("");
        configurationKeyValuesService.saveConfigKeyValue(keyValue);
        keyValue.setValue("");
        for(int i=1;i<=4;i++){
            keyValue = new ConfigurationKeyValues();
            keyValue.setKey(user.getUsername()+"-img"+i);
            keyValue.setValue("");
            configurationKeyValuesService.saveConfigKeyValue(keyValue);
        }
        return new ResponseEntity<>("User Added Successfully",HttpStatus.OK);
    }

    @GetMapping("/team/{teamId}/user")
    public ResponseEntity<?> getUserDetails(@PathVariable Long teamId, Principal principal){
        if(!userService.existsByUsernameAndTeamId(principal.getName(),teamId)){
            ResponseMessage responseMessage = new ResponseMessage();
            responseMessage.setMessage("INVALID DATA ACCESS!");
            return new ResponseEntity<>(responseMessage,HttpStatus.FORBIDDEN);
        }
        UserDetails userDetails = userService.getUserDetails(teamId, principal.getName());
        return new ResponseEntity<>(userDetails,HttpStatus.OK);
    }
}
