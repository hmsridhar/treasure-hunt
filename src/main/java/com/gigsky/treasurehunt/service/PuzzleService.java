package com.gigsky.treasurehunt.service;

import com.gigsky.treasurehunt.dao.HasAnsweredPuzzleRepository;
import com.gigsky.treasurehunt.dao.PuzzleRepository;
import com.gigsky.treasurehunt.model.beans.Answer;
import com.gigsky.treasurehunt.model.beans.PuzzleInfo;
import com.gigsky.treasurehunt.model.beans.TeamPuzzleAnswers;
import com.gigsky.treasurehunt.model.dbbeans.HasAnsweredPuzzle;
import com.gigsky.treasurehunt.model.dbbeans.Puzzle;
import com.gigsky.treasurehunt.model.dbbeans.TeamPuzzle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PuzzleService {

    private static final Logger logger= LoggerFactory.getLogger(PuzzleService.class);
    @Autowired
    HasAnsweredPuzzleRepository hasAnsweredPuzzleRepository;

    @Autowired
    PuzzleRepository puzzleRepository;




    public List<HasAnsweredPuzzle> getAnsweredListForTeam(Long teamId){

        List<HasAnsweredPuzzle>answeredPuzzlesByTeam=hasAnsweredPuzzleRepository.findHasAnsweredPuzzleByTeamPuzzle_TeamId(teamId);

        return answeredPuzzlesByTeam;
    }

    public boolean submitAnswer(Long puzzleId, Long teamId, Answer answer){
        try {
            String answerForPuzzle = answer.getAnswer();
            TeamPuzzle teamPuzzle = new TeamPuzzle();
            teamPuzzle.setPuzzleId(puzzleId);
            teamPuzzle.setTeamId(teamId);
            HasAnsweredPuzzle hasAnsweredPuzzle=new HasAnsweredPuzzle();
            hasAnsweredPuzzle.setAnswer(answerForPuzzle);
            hasAnsweredPuzzle.setTeamPuzzle(teamPuzzle);
            hasAnsweredPuzzleRepository.save(hasAnsweredPuzzle);
            return true;
        }catch (Exception e){

        }
        return false;
    }

    public TeamPuzzleAnswers getPuzzleInfo(Long teamId) {
        Iterable<Puzzle> puzzleIterable = puzzleRepository.findAll();
        List<Puzzle> puzzles = new ArrayList<>();
        for (Puzzle puzzle : puzzleIterable) {
            if (puzzle != null) {
                puzzles.add(puzzle);
            }
        }
        int rightAnswers=0;
        int wrongAnswers=0;
        TeamPuzzleAnswers teamPuzzleAnswers=new TeamPuzzleAnswers();
        List<PuzzleInfo>puzzleInfos=new ArrayList<>();
        for (Puzzle puzzle : puzzles) {
            PuzzleInfo puzzleInfo = new PuzzleInfo();
            puzzleInfo.setId(puzzle.getId());
            puzzleInfo.setFilename(puzzle.getFilename());
            puzzleInfo.setPoints(puzzle.getPoints());
            puzzleInfo.setQuestion(puzzle.getQuestion());
            HasAnsweredPuzzle hasAnsweredPuzzle = getPuzzleAnswerStatusTeam(teamId,puzzle.getId());
            String teamAnswer=hasAnsweredPuzzle.getAnswer();
            puzzleInfo.setTeamAnswer(teamAnswer);
            if(!teamAnswer.isEmpty()) {
                boolean correctAnswer = checkAnswer(teamAnswer, puzzle.getId());
                if(correctAnswer){
                    rightAnswers++;
                }
                else
                {
                    wrongAnswers++;
                }
            }
            puzzleInfos.add(puzzleInfo);

        }
        teamPuzzleAnswers.setNumcorrectAns(Long.valueOf(rightAnswers));
        teamPuzzleAnswers.setNumWrongAns(Long.valueOf(wrongAnswers));
        teamPuzzleAnswers.setList(puzzleInfos);

        return teamPuzzleAnswers;
    }

    private boolean checkAnswer(String teamAnswer,Long id) {
        Puzzle puzzle=puzzleRepository.findPuzzleById(id);

        String[] listOfAnswers=puzzle.getAnswer().split(",");
        List<String> answersList= Arrays.asList(listOfAnswers);
        if(answersList.contains(teamAnswer.toLowerCase())){
            return true;
        }
        return  false;
    }

    public HasAnsweredPuzzle getPuzzleAnswerStatusTeam(Long teamId,Long puzzleId){
         HasAnsweredPuzzle hasAnsweredPuzzle=
                 hasAnsweredPuzzleRepository.findByTeamPuzzle_TeamIdAAndTeamPuzzle_PuzzleId(teamId,puzzleId);
         return hasAnsweredPuzzle;
        }



    }



