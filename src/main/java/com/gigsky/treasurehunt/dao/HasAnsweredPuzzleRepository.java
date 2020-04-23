package com.gigsky.treasurehunt.dao;

import com.gigsky.treasurehunt.model.dbbeans.HasAnsweredPuzzle;
import com.gigsky.treasurehunt.model.dbbeans.TeamPuzzle;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HasAnsweredPuzzleRepository extends CrudRepository<HasAnsweredPuzzle, TeamPuzzle> {
    //List<HasAnsweredPuzzle> findHasAnsweredPuzzleByTeamId(Long teamId);
    List<HasAnsweredPuzzle> findHasAnsweredPuzzleByTeamPuzzle_TeamId(Long teamId);
    HasAnsweredPuzzle findByTeamPuzzle_TeamIdAAndTeamPuzzle_PuzzleId(Long teamId,Long puzzleId);
}
