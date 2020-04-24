package com.gigsky.treasurehunt.controller;

import com.gigsky.treasurehunt.model.beans.Passkey;
import com.gigsky.treasurehunt.model.dbbeans.ResponseMessage;
import com.gigsky.treasurehunt.service.ConfigurationKeyValuesService;
import com.gigsky.treasurehunt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

/**
 * Created by harshams on 24/04/2020
 */
@RestController
@RequestMapping("/config")
public class ConfigController {

    @Autowired
    ConfigurationKeyValuesService configurationKeyValuesService;
    @Autowired
    UserService userService;

    @GetMapping("/day")
    public ResponseEntity<?> getDayConfigValue()throws Exception{
        Integer day = configurationKeyValuesService.getIntegerConfigValue("day");
        ResponseMessage responseMessage = new ResponseMessage();
        responseMessage.setMessage(day.toString());
        return new ResponseEntity<>(responseMessage, HttpStatus.OK);
    }

    @GetMapping("/team/{teamId}/key")
    public ResponseEntity<?> getKeyForTeam(@PathVariable Long teamId, Principal principal){
        ResponseMessage responseMessage = new ResponseMessage();
        if(!userService.existsByUsernameAndTeamId(principal.getName(),teamId)){
            responseMessage.setMessage("INVALID DATA ACCESS!");
            return new ResponseEntity<>(responseMessage,HttpStatus.FORBIDDEN);
        }
        String key = configurationKeyValuesService.getKeyForTeam(teamId);
        if(key.equals("")){
            responseMessage.setMessage("Illegal access to method!");
            return new ResponseEntity<>(responseMessage, HttpStatus.BAD_REQUEST);
        }
        Passkey passkey = new Passkey();
        passkey.setKey(key);
        return new ResponseEntity<>(passkey,HttpStatus.OK);
    }

    @PostMapping(value = "/team/{teamId}/passkey/enter",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> submitPassKeyAndMoveUserToNextStage(@PathVariable Long teamId,@RequestBody Passkey passkey,Principal principal){
        ResponseMessage responseMessage = new ResponseMessage();
        if(!userService.existsByUsernameAndTeamId(principal.getName(),teamId)){
            responseMessage.setMessage("INVALID DATA ACCESS!");
            return new ResponseEntity<>(responseMessage,HttpStatus.FORBIDDEN);
        }
        String moveStatus = configurationKeyValuesService.submitPassKeyAndMoveUserAhead(teamId,passkey.getKey());
        if(moveStatus.equals("accepted")){
            responseMessage.setMessage("Move Accepted");
            return new ResponseEntity<>(responseMessage,HttpStatus.OK);
        }else{
            responseMessage.setMessage("Move Rejected");
            return new ResponseEntity<>(responseMessage,HttpStatus.BAD_REQUEST);
        }
    }
}
