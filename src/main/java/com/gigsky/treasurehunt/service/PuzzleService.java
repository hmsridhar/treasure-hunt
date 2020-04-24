package com.gigsky.treasurehunt.service;

import com.gigsky.treasurehunt.dao.HasAnsweredPuzzleRepository;
import com.gigsky.treasurehunt.dao.PuzzleRepository;
import com.gigsky.treasurehunt.model.beans.Answer;
import com.gigsky.treasurehunt.model.beans.PuzzleInfo;
import com.gigsky.treasurehunt.model.beans.PuzzleList;
import com.gigsky.treasurehunt.model.beans.TeamPuzzleAnswers;
import com.gigsky.treasurehunt.model.dbbeans.HasAnsweredPuzzle;
import com.gigsky.treasurehunt.model.dbbeans.Puzzle;
import com.gigsky.treasurehunt.model.dbbeans.ResponseMessage;
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

    private static final String MAX_ATTEMPTS_PUZZLE="MAX_ATTEMPTS_PUZZLE";
    @Autowired
    HasAnsweredPuzzleRepository hasAnsweredPuzzleRepository;

    @Autowired
    PuzzleRepository puzzleRepository;

    @Autowired
    ConfigurationKeyValuesService configurationKeyValuesService;




//    public List<HasAnsweredPuzzle> getAnsweredListForTeam(Long teamId){
//
//        List<HasAnsweredPuzzle>answeredPuzzlesByTeam=hasAnsweredPuzzleRepository.findHasAnsweredPuzzleByTeamPuzzle_TeamId(teamId);
//
//        return answeredPuzzlesByTeam;
//    }

    public ResponseMessage submitAnswer(Long puzzleId, Long teamId, Answer answer){
        try {

            ResponseMessage responseMessage=new ResponseMessage();

            TeamPuzzle teamPuzzle=new TeamPuzzle();
            teamPuzzle.setTeamId(teamId);
            teamPuzzle.setPuzzleId(puzzleId);
            HasAnsweredPuzzle puzzleInfoTeam=hasAnsweredPuzzleRepository.findByTeamPuzzle(teamPuzzle);
            Long attempts=puzzleInfoTeam.getAttempts();
            //check if max attempts reached
            Integer maxAttempts=configurationKeyValuesService.getIntegerConfigValue(MAX_ATTEMPTS_PUZZLE);
            if(attempts>=maxAttempts){
                responseMessage.setMessage("Max attempts reached");
                return responseMessage;
            }

            String teamanswer = answer.getAnswer();
            //check if answer is correct

            boolean correctAns=checkAnswer(teamanswer,puzzleId);
            HasAnsweredPuzzle hasAnsweredPuzzle=new HasAnsweredPuzzle();
            attempts+=1;
            if(correctAns){
                hasAnsweredPuzzle.setAnswer(teamanswer);
                hasAnsweredPuzzle.setTeamPuzzle(teamPuzzle);
                hasAnsweredPuzzle.setHasAnswered(true);
                hasAnsweredPuzzle.setAttempts(attempts);
                hasAnsweredPuzzleRepository.save(hasAnsweredPuzzle);
                responseMessage.setMessage("Answer submitted successfully");
                return responseMessage;
            }
            else{
                hasAnsweredPuzzle.setTeamPuzzle(teamPuzzle);
                hasAnsweredPuzzle.setHasAnswered(false);
                hasAnsweredPuzzle.setAttempts(attempts);
                hasAnsweredPuzzle.setAnswer("");
                hasAnsweredPuzzleRepository.save(hasAnsweredPuzzle);
                responseMessage.setMessage("Incorrect answer,current attempts : "+ attempts);
                return responseMessage;
            }




        }catch (Exception e){
            logger.error("exception "+e);
        }
        return null;
    }

    public TeamPuzzleAnswers getPuzzleInfoTeam(Long teamId) {
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

        teamPuzzleAnswers.setList(puzzleInfos);

        return teamPuzzleAnswers;
    }

    private boolean checkAnswer(String teamAnswer,Long id) {
        if(teamAnswer==null){
            return false;
        }
        Puzzle puzzle=puzzleRepository.findPuzzleById(id);

        String[] listOfAnswers=puzzle.getAnswer().split(",");
        List<String> answersList= Arrays.asList(listOfAnswers);
        if(answersList.contains(teamAnswer.toLowerCase())){
            return true;
        }
        return  false;
    }

    public HasAnsweredPuzzle getPuzzleAnswerStatusTeam(Long teamId,Long puzzleId){
        TeamPuzzle teamPuzzle = new TeamPuzzle();
        teamPuzzle.setTeamId(teamId);
        teamPuzzle.setPuzzleId(puzzleId);
         HasAnsweredPuzzle hasAnsweredPuzzle=
//                 hasAnsweredPuzzleRepository.findByTeamPuzzle_TeamIdAAndTeamPuzzle_PuzzleId(teamId,puzzleId);
            hasAnsweredPuzzleRepository.findByTeamPuzzle(teamPuzzle);
         return hasAnsweredPuzzle;
        }


        public PuzzleList getAllPuzzles(){
            Iterable<Puzzle>puzzles= puzzleRepository.findAll();
            PuzzleList puzzlesList=new PuzzleList();
            List<PuzzleInfo>puzzleList=new ArrayList<>();
            for(Puzzle puzzle:puzzles){
               PuzzleInfo puzzleInfo=new PuzzleInfo();
               puzzleInfo.setTeamAnswer(puzzle.getAnswer());
               puzzleInfo.setQuestion(puzzle.getQuestion());
               puzzleInfo.setPoints(puzzle.getPoints());
               puzzleInfo.setFilename(puzzle.getFilename());
               puzzleInfo.setId(puzzle.getId());
               puzzleInfo.setType(puzzle.getType());
               puzzleList.add(puzzleInfo);
            }
            puzzlesList.setList(puzzleList);
            return puzzlesList;

        }

    }



