package com.gigsky.treasurehunt.controller;

import com.gigsky.treasurehunt.model.beans.TeamInfo;
import com.gigsky.treasurehunt.model.dbbeans.ResponseMessage;
import com.gigsky.treasurehunt.service.TeamMembersService;
import com.gigsky.treasurehunt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by harshams on 21/04/2020
 */
@RestController
@RequestMapping("/team/{teamId}/members")
public class TeamMembersController {

    @Autowired
    TeamMembersService teamMembersService;

    @Autowired
    UserService userService;

    @GetMapping(value = "",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getTeamMembers(@PathVariable Long teamId, Principal principal){
        if(!userService.existsByUsernameAndTeamId(principal.getName(),teamId)){
            ResponseMessage responseMessage = new ResponseMessage();
            responseMessage.setMessage("INVALID DATA ACCESS!");
            return new ResponseEntity<>(responseMessage,HttpStatus.FORBIDDEN);
        }
        return new ResponseEntity<>(teamMembersService.getTeamMembers(teamId), HttpStatus.OK);
    }
}
