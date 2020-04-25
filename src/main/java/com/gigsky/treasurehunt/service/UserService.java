package com.gigsky.treasurehunt.service;

import com.gigsky.treasurehunt.dao.TeamRepository;
import com.gigsky.treasurehunt.dao.UserRepository;
import com.gigsky.treasurehunt.model.beans.UserDetails;
import com.gigsky.treasurehunt.model.dbbeans.Team;
import com.gigsky.treasurehunt.model.dbbeans.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by harshams on 20/04/2020
 */
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    ConfigurationKeyValuesService configurationKeyValuesService;
    @Autowired
    TeamRepository teamRepository;

    public Boolean isLoginValid(User user){
        User dbUser = userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
        if(dbUser!= null && dbUser.getUsername().equals(user.getUsername()) && dbUser.getPassword().equals(user.getPassword()))
            return true;
        return false;

    }

    public User findByUsername(String username){
        return userRepository.findByUsername(username);
    }

    public void addOrUpdateUser(User user){ userRepository.save(user); }

    public Boolean existsByUsernameAndTeamId(String username, Long teamId){
        return userRepository.existsByUsernameAndTeamId(username, teamId);
    }

    public UserDetails getUserDetails(Long teamId, String username){
        UserDetails userDetails = new UserDetails();
        Team team = teamRepository.findTeamById(teamId);
        userDetails.setTeamId(teamId);
        userDetails.setUsername(username);
        userDetails.setTeamName(team.getName());
        userDetails.setLastUpdatedScore(team.getScore());
        userDetails.setCurrentDay(configurationKeyValuesService.getIntegerConfigValue("day"));
        userDetails.setTeamDay(configurationKeyValuesService.getIntegerConfigValue(team.getName()+"-day"));
        userDetails.setTeamStage(configurationKeyValuesService.getIntegerConfigValue(team.getName()+"-stage"));
        userDetails.setTeamImageUploadStatus(configurationKeyValuesService.getStringConfigValue(team.getName()+"-img"+userDetails.getTeamDay()).equals("")?"pending":"done");
        userDetails.setHint(configurationKeyValuesService.getStringConfigValue(team.getName()+"-hint"));
        userDetails.setToken("Bearer "+userRepository.getTokenByUsername(username));
        return userDetails;
    }

}
