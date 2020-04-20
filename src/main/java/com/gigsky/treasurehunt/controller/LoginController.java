package com.gigsky.treasurehunt.controller;

import com.gigsky.treasurehunt.model.ResponseMessage;
import com.gigsky.treasurehunt.model.User;
import com.gigsky.treasurehunt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by harshams on 20/04/2020
 */
@RestController
@RequestMapping(path = "/test")
public class LoginController {

    @Autowired
    UserService userService;

    @PostMapping(value = "",produces = "application/json")
    public ResponseEntity<?> login(@RequestBody User user){
        ResponseMessage responseMessage = new ResponseMessage();
        if(userService.isLoginValid(user)) {
            responseMessage.setMessage("Login Successful");
            return new ResponseEntity<>(responseMessage, HttpStatus.OK);
        }
        else {
            responseMessage.setMessage("Invalid Credentails!");
            return new ResponseEntity<>(responseMessage, HttpStatus.UNAUTHORIZED);
        }
    }
}
