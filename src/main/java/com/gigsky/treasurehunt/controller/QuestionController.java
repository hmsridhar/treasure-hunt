package com.gigsky.treasurehunt.controller;


import com.gigsky.treasurehunt.dao.ConfigurationKeyValuesRepository;
import com.gigsky.treasurehunt.model.beans.Answer;
import com.gigsky.treasurehunt.model.beans.Clue;
import com.gigsky.treasurehunt.model.beans.QuestionInfo;
import com.gigsky.treasurehunt.model.beans.TeamPoints;
import com.gigsky.treasurehunt.model.dbbeans.ConfigurationKeyValues;
import com.gigsky.treasurehunt.model.dbbeans.ResponseMessage;
import com.gigsky.treasurehunt.model.dbbeans.Team;
import com.gigsky.treasurehunt.service.ConfigurationKeyValuesService;
import com.gigsky.treasurehunt.service.QuestionService;
import com.gigsky.treasurehunt.service.TeamService;
import com.gigsky.treasurehunt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.security.Principal;


@RestController
@RequestMapping("/question")
public class QuestionController {

    public static final String successMessage="Answer submitted successfully";
    public static final String failureMessage="Incorrect answer,please Retry";
    public static final String PUZZLES_REQ_UNLOCK_CLUE="PUZZLES_REQ_UNLOCK_CLUE";
    public static final String COINS_REQUIRED_UNLOCK_CLUE="COINS_REQUIRED_UNLOCK_CLUE";

    @Autowired
    QuestionService questionService;

    @Autowired
    TeamService teamService;

    @Autowired
    ConfigurationKeyValuesService configurationKeyValuesService;

    @Autowired
    UserService userService;


    @GetMapping("/{teamId}")
    public ResponseEntity<?> getQuestion(@PathVariable("teamId")Long teamId, Principal principal){
        try {
            if(!userService.existsByUsernameAndTeamId(principal.getName(),teamId)){
                ResponseMessage responseMessage = new ResponseMessage();
                responseMessage.setMessage("INVALID DATA ACCESS!");
                return new ResponseEntity<>(responseMessage,HttpStatus.FORBIDDEN);
            }
            QuestionInfo questionInfo = questionService.getQuestionInfo(teamId);
            return new ResponseEntity<>(questionInfo,HttpStatus.OK);
        }catch (Exception e ){

        }
        return null;
    }

    @GetMapping("/{teamId}/{questionId}/clue")
    public ResponseEntity<?> getClueForQuestion(@PathVariable("questionId")Long questionId,@PathVariable("teamId")Long teamId,Principal principal){
        if(!userService.existsByUsernameAndTeamId(principal.getName(),teamId)){
            ResponseMessage responseMessage = new ResponseMessage();
            responseMessage.setMessage("INVALID DATA ACCESS!");
            return new ResponseEntity<>(responseMessage,HttpStatus.FORBIDDEN);
        }

        //check if 10 puzzles answered or score>=20
        TeamPoints teamPoints=teamService.getPoints(teamId);
        Long score=teamPoints.getPoints();
        //get config points required.

        Integer puzzlesToSolve=configurationKeyValuesService.getIntegerConfigValue(PUZZLES_REQ_UNLOCK_CLUE);
        Integer coinsReq=configurationKeyValuesService.getIntegerConfigValue(COINS_REQUIRED_UNLOCK_CLUE);

        if(score<coinsReq){
            ResponseMessage responseMessage=new ResponseMessage();
            responseMessage.setMessage("Not Enough Coins..Need total of "+coinsReq+" coins to redeem clue");
            return new  ResponseEntity<>(responseMessage,HttpStatus.OK);
        }
        //score is greater than 20, so can redeem clue
        Clue clue=questionService.getClue(questionId);
        //update db, reduce score by 20.
        teamService.updatePointsReduceByCluePoints(teamId,coinsReq);
        return new  ResponseEntity<>(clue,HttpStatus.OK);

    }

    @PostMapping("/{teamId}/{questionId}/answer")
    public ResponseEntity<?> submitAnswerQuestion(@PathVariable("teamId")Long teamId, @PathVariable("questionId")Long questionId,@RequestBody Answer answer,Principal principal){
        if(!userService.existsByUsernameAndTeamId(principal.getName(),teamId)){
            ResponseMessage responseMessage = new ResponseMessage();
            responseMessage.setMessage("INVALID DATA ACCESS!");
            return new ResponseEntity<>(responseMessage,HttpStatus.FORBIDDEN);
        }
        boolean result=questionService.submitAnswer(questionId,teamId,answer);
        ResponseMessage responseMessage=new ResponseMessage();
        if(result) {
            responseMessage.setMessage(successMessage);
        }else{
            responseMessage.setMessage(failureMessage);
        }
        return new ResponseEntity<>(responseMessage, HttpStatus.BAD_REQUEST);
    }
}
