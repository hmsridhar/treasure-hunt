package com.gigsky.treasurehunt.controller;


import com.gigsky.treasurehunt.model.beans.Answer;
import com.gigsky.treasurehunt.model.beans.Clue;
import com.gigsky.treasurehunt.model.beans.QuestionInfo;
import com.gigsky.treasurehunt.service.QuestionService;
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

    @Autowired
    QuestionService questionService;

    @GetMapping("/{teamId}")
    public ResponseEntity<?> getQuestion(@PathVariable("teamId")Long teamId){
        try {
            QuestionInfo questionInfo = questionService.getQuestionInfo(teamId);
            return new ResponseEntity<>(questionInfo,HttpStatus.OK);
        }catch (Exception e ){

        }
        return null;
    }

    @GetMapping("/{questionId}/clue")
    public ResponseEntity<?> getClueForQuestion(@PathVariable("questionId")Long questionId){
        Clue clue=questionService.getClue(questionId);
        return new  ResponseEntity<>(clue,HttpStatus.OK);
    }

    @PostMapping("/{teamId}/{questionId}/answer")
    public ResponseEntity<?> submitAnswerQuestion(@PathVariable("teamId")Long teamId, @PathVariable("questionId")Long questionId, Answer answer){
        boolean result=questionService.submitAnswer(questionId,teamId,answer);
        return ResponseEntity.created(URI.create("/{teamId}/{questionId}")).build();
    }
}
