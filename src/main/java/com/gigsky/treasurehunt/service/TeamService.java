package com.gigsky.treasurehunt.service;

import com.gigsky.treasurehunt.dao.TeamRepository;
import com.gigsky.treasurehunt.model.beans.*;
import com.gigsky.treasurehunt.model.dbbeans.Team;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by harshams on 20/04/2020
 */
@Service
public class TeamService {

    private static final Logger logger= LoggerFactory.getLogger(TeamService.class);

    @Autowired
    TeamRepository teamRepository;

    public ObjectList getAllTeams(){
        ObjectList objectList = new ObjectList();
        objectList.setType("teamList");
        Iterable<Team> teams = teamRepository.findAll();
        List<Team> teamList = new ArrayList<>();
        for(Team team: teams){
            teamList.add(team);
        }
        objectList.setList(teamList);
        return objectList;
    }

    public TeamPoints getPoints(Long teamId){
       Team team= teamRepository.findTeamById(teamId);
       TeamPoints teamPoints=new TeamPoints();
       teamPoints.setPoints(team.getScore());
       teamPoints.setTeamName(team.getName());
       return teamPoints;

    }

    public Team getTeamNameFromTeamId(Long teamId){
        Team team=teamRepository.findTeamById(teamId);

        return team;
    }


    public TeamScoresList generateLeaderBoard(){
        TeamScoresList teamScoresList=new TeamScoresList();
        List<TeamScore>teamScoreList=new ArrayList<>();
        List<Team> teamList=teamRepository.findAllByOrderByScoreDesc();
        for(Team team:teamList){
            TeamScore teamScore=new TeamScore();
            teamScore.setScore(team.getScore());
            teamScore.setTeamName(team.getName());
            teamScoreList.add(teamScore);
        }
        teamScoresList.setList(teamScoreList);
        return teamScoresList;

    }








}
