package com.gigsky.treasurehunt.service;

import com.gigsky.treasurehunt.dao.TeamRepository;
import com.gigsky.treasurehunt.model.ObjectList;
import com.gigsky.treasurehunt.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by harshams on 20/04/2020
 */
@Service
public class TeamService {

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
}
