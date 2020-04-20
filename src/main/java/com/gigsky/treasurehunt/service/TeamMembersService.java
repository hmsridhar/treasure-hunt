package com.gigsky.treasurehunt.service;

import com.gigsky.treasurehunt.dao.TeamMembersRepository;
import com.gigsky.treasurehunt.model.ObjectList;
import com.gigsky.treasurehunt.model.TeamMembers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by harshams on 21/04/2020
 */
@Service
public class TeamMembersService {

    @Autowired
    TeamMembersRepository teamMembersRepository;

    public ObjectList getTeamMembers(Long teamId){
        ObjectList objectList = new ObjectList();
        objectList.setType("teamMembersList");
        Iterable<TeamMembers> teamMembers = teamMembersRepository.findAllByTeamId(teamId);
        List<TeamMembers> teamMembersList = new ArrayList<>();
        for(TeamMembers teamMembers1: teamMembers){
            teamMembersList.add(teamMembers1);
        }
        objectList.setList(teamMembersList);
        return objectList;
    }
}
