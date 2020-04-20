package com.gigsky.treasurehunt.controller;

import com.gigsky.treasurehunt.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by harshams on 20/04/2020
 */
@RestController
@RequestMapping("/team")
public class TeamController {

    @Autowired
    TeamService teamService;

    @GetMapping(value = "",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getTeams(){
        return new ResponseEntity<>(teamService.getAllTeams(), HttpStatus.OK);
    }
}
