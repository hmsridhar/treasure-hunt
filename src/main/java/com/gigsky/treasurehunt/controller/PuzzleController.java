package com.gigsky.treasurehunt.controller;


import com.gigsky.treasurehunt.dao.PuzzleRepository;
import com.gigsky.treasurehunt.model.beans.Answer;
import com.gigsky.treasurehunt.model.beans.PuzzleList;
import com.gigsky.treasurehunt.model.beans.TeamPuzzleAnswers;
import com.gigsky.treasurehunt.model.dbbeans.Puzzle;
import com.gigsky.treasurehunt.model.dbbeans.ResponseMessage;
import com.gigsky.treasurehunt.service.PuzzleService;
import com.gigsky.treasurehunt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/puzzle")
public class PuzzleController {
    public static final String successMessage="Answer submitted successfully";
    public static final String failureMessage="Answer not submitted,please retry";

    @Autowired
    PuzzleService puzzleService;

    @Autowired
    PuzzleRepository puzzleRepository;

    @Autowired
    UserService userService;

    @GetMapping(value = "/{teamId}")
    public ResponseEntity<?>getPuzzles(@PathVariable("teamId")Long teamId,Principal principal){
        if(!userService.existsByUsernameAndTeamId(principal.getName(),teamId)){
            ResponseMessage responseMessage = new ResponseMessage();
            responseMessage.setMessage("INVALID DATA ACCESS!");
            return new ResponseEntity<>(responseMessage,HttpStatus.FORBIDDEN);
        }

      TeamPuzzleAnswers puzzlesList=puzzleService.getPuzzleInfoTeam(teamId);
      return new ResponseEntity<>(puzzlesList,HttpStatus.OK);

    }






    @PostMapping(value = "/{teamId}/{puzzleId}/answer")
    public ResponseEntity<?> submitAnswerPuzzle(@PathVariable("puzzleId")Long puzzleId, @PathVariable("teamId")Long teamId, @RequestBody Answer answer, Principal principal){
        if(!userService.existsByUsernameAndTeamId(principal.getName(),teamId)){
            ResponseMessage responseMessage = new ResponseMessage();
            responseMessage.setMessage("INVALID DATA ACCESS!");
            return new ResponseEntity<>(responseMessage,HttpStatus.FORBIDDEN);
        }
        ResponseMessage responseMessage=puzzleService.submitAnswer(puzzleId,teamId,answer);

        return new ResponseEntity<>(responseMessage, HttpStatus.OK);

    }





}
