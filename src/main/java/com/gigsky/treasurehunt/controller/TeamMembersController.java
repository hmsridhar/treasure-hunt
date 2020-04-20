package com.gigsky.treasurehunt.controller;

import com.gigsky.treasurehunt.service.TeamMembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by harshams on 21/04/2020
 */
@RestController
@RequestMapping("/team/{teamId}/members")
public class TeamMembersController {

    @Autowired
    TeamMembersService teamMembersService;

    @GetMapping(value = "",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getTeamMembers(@PathVariable Long teamId){
        return new ResponseEntity<>(teamMembersService.getTeamMembers(teamId), HttpStatus.OK);
    }
}
