package com.gigsky.treasurehunt.controller;

import com.gigsky.treasurehunt.model.dbbeans.ResponseMessage;
import com.gigsky.treasurehunt.service.ConfigurationKeyValuesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by harshams on 24/04/2020
 */
@RestController
@RequestMapping("/config")
public class ConfigController {

    @Autowired
    ConfigurationKeyValuesService configurationKeyValuesService;

    @GetMapping("/day")
    public ResponseEntity<?> getDayConfigValue()throws Exception{
        Integer day = configurationKeyValuesService.getIntegerConfigValue("day");
        ResponseMessage responseMessage = new ResponseMessage();
        responseMessage.setMessage(day.toString());
        return new ResponseEntity<>(responseMessage, HttpStatus.OK);
    }
}
