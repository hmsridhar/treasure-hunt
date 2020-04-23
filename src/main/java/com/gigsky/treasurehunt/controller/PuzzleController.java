package com.gigsky.treasurehunt.controller;


import com.gigsky.treasurehunt.model.beans.Answer;
import com.gigsky.treasurehunt.service.PuzzleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/puzzle")
public class PuzzleController {

    @Autowired
    PuzzleService puzzleService;

    @GetMapping(value = "")
    public ResponseEntity<?>getPuzzles(){
        return null;
    }


    @PostMapping(value = "/{teamId}/{puzzleId}/answer")
    public void submitAnswerPuzzle(@PathVariable("puzzleId")Long puzzleId, @PathVariable("teamId")Long teamId, Answer answer){
        boolean result=puzzleService.submitAnswer(puzzleId,teamId,answer);
    }





}
