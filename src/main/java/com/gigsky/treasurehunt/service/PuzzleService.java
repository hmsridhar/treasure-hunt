package com.gigsky.treasurehunt.service;

import com.gigsky.treasurehunt.dao.HasAnsweredPuzzleRepository;
import com.gigsky.treasurehunt.model.beans.Answer;
import com.gigsky.treasurehunt.model.dbbeans.HasAnsweredPuzzle;
import com.gigsky.treasurehunt.model.dbbeans.TeamPuzzle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PuzzleService {

    private static final Logger logger= LoggerFactory.getLogger(PuzzleService.class);
    @Autowired
    HasAnsweredPuzzleRepository hasAnsweredPuzzleRepository;




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


}
