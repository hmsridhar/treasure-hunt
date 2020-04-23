package com.gigsky.treasurehunt.service;

import com.gigsky.treasurehunt.dao.TeamMembersRepository;
import com.gigsky.treasurehunt.model.beans.ObjectList;
import com.gigsky.treasurehunt.model.beans.TeamInfo;
import com.gigsky.treasurehunt.model.dbbeans.Team;
import com.gigsky.treasurehunt.model.dbbeans.TeamMembers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by harshams on 21/04/2020
 */
@Service
public class TeamMembersService {

    private static final Logger logger= LoggerFactory.getLogger(TeamMembersService.class);

    @Autowired
    TeamMembersRepository teamMembersRepository;

    @Autowired
    TeamService teamService;

    public ObjectList getTeamMembers(Long teamId){
        ObjectList objectList = new ObjectList();
        objectList.setType("teamMembersList");
        Iterable<TeamMembers> teamMembers = teamMembersRepository.findTeamMembersByTeamMembersKey_TeamId(teamId);
        List<TeamMembers> teamMembersList = new ArrayList<>();
        for(TeamMembers teamMembers1: teamMembers){
            teamMembersList.add(teamMembers1);
        }
        objectList.setList(teamMembersList);
        return objectList;
    }

    public TeamInfo getTeamInfoByTeam(Long teamId){
        TeamInfo teamInfo=new TeamInfo();
        Iterable<TeamMembers> teamMembersIterable=teamMembersRepository.findTeamMembersByTeamMembersKey_TeamId(teamId);
        List<TeamMembers> teamMembersList = new ArrayList<>();
        for(TeamMembers teamMembers:teamMembersIterable){
            teamMembersList.add(teamMembers);
        }

        Team team=teamService.getTeamNameFromTeamId(teamId);
        teamInfo.setName(team.getName());
        teamInfo.setList(teamMembersList);
        teamInfo.setScore(team.getScore());
        return teamInfo;




    }


}
