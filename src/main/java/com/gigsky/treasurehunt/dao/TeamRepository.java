package com.gigsky.treasurehunt.dao;

import com.gigsky.treasurehunt.model.dbbeans.Team;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by harshams on 20/04/2020
 */
@Repository
public interface TeamRepository extends CrudRepository<Team,Long> {

    Team findTeamById(Long teamId);

    List<Team> findAllByOrderByScoreDesc();

    @Query("select name from Team where id = :teamId")
    String getTeamNameByTeamId(@Param("teamId") Long teamId);
}
