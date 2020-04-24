package com.gigsky.treasurehunt.controller;


import com.gigsky.treasurehunt.dao.ConfigurationKeyValuesRepository;
import com.gigsky.treasurehunt.model.beans.Answer;
import com.gigsky.treasurehunt.model.beans.Clue;
import com.gigsky.treasurehunt.model.beans.QuestionInfo;
import com.gigsky.treasurehunt.model.beans.TeamPoints;
import com.gigsky.treasurehunt.model.dbbeans.ConfigurationKeyValues;
import com.gigsky.treasurehunt.model.dbbeans.ResponseMessage;
import com.gigsky.treasurehunt.model.dbbeans.Team;
import com.gigsky.treasurehunt.service.QuestionService;
import com.gigsky.treasurehunt.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;


@RestController
@RequestMapping("/question")
public class QuestionController {

    public static final String successMessage="Answer submitted successfully";
    public static final String failureMessage="Answer not submitted,please retry";
    public static final String PUZZLES_REQ_UNLOCK_CLUE="PUZZLES_REQ_UNLOCK_CLUE";


    @Autowired
    QuestionService questionService;

    @Autowired
    TeamService teamService;

    @Autowired
    ConfigurationKeyValuesRepository configurationKeyValuesRepository;



    @GetMapping("/{teamId}")
    public ResponseEntity<?> getQuestion(@PathVariable("teamId")Long teamId){
        try {
            QuestionInfo questionInfo = questionService.getQuestionInfo(teamId);
            return new ResponseEntity<>(questionInfo,HttpStatus.OK);
        }catch (Exception e ){

        }
        return null;
    }

    @GetMapping("/{teamId}/{questionId}/clue")
    public ResponseEntity<?> getClueForQuestion(@PathVariable("questionId")Long questionId,@PathVariable("teamId")Long teamId){

        //check if 10 puzzles answered or score>=20
        TeamPoints teamPoints=teamService.getPoints(teamId);
        Long score=teamPoints.getPoints();
        //get config points required.
        ConfigurationKeyValues configurationKeyValue=configurationKeyValuesRepository.findByKey(PUZZLES_REQ_UNLOCK_CLUE);
        Integer puzzlesToSolve=Integer.valueOf(configurationKeyValue.getValue());

        if(score<puzzlesToSolve){
            ResponseMessage responseMessage=new ResponseMessage();
            responseMessage.setMessage("Not Enough Coins..Need"+20+"coins to redeem clue");
            return new  ResponseEntity<>(responseMessage,HttpStatus.OK);
        }
        //score is greater than 20, so can redeem clue
        Clue clue=questionService.getClue(questionId);
        //update db, reduce score by 20.
        teamService.updatePointsReduceByCluePoints(teamId,puzzlesToSolve);
        return new  ResponseEntity<>(clue,HttpStatus.OK);

    }

    @PostMapping("/{teamId}/{questionId}/answer")
    public ResponseEntity<?> submitAnswerQuestion(@PathVariable("teamId")Long teamId, @PathVariable("questionId")Long questionId, Answer answer){
        boolean result=questionService.submitAnswer(questionId,teamId,answer);
        return ResponseEntity.created(URI.create("/{teamId}/{questionId}")).build();
    }
}
