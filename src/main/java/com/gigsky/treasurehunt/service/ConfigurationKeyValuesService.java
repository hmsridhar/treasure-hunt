package com.gigsky.treasurehunt.service;

import com.gigsky.treasurehunt.dao.ConfigurationKeyValuesRepository;
import com.gigsky.treasurehunt.dao.TeamRepository;
import com.gigsky.treasurehunt.model.dbbeans.ConfigurationKeyValues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Created by harshams on 24/04/2020
 */
@Service
public class ConfigurationKeyValuesService {

    @Autowired
    ConfigurationKeyValuesRepository configurationKeyValuesRepository;
    @Autowired
    TeamRepository teamRepository;

    public String getStringConfigValue(String key){
        ConfigurationKeyValues configurationKeyValues = configurationKeyValuesRepository.findByKey(key);
        return configurationKeyValues == null ? null : configurationKeyValues.getValue();
    }

    public Integer getIntegerConfigValue(String key){
        ConfigurationKeyValues configurationKeyValues = configurationKeyValuesRepository.findByKey(key);
        return configurationKeyValues == null ? null : Integer.parseInt(configurationKeyValues.getValue());
    }

    public void saveConfigKeyValue(ConfigurationKeyValues configurationKeyValues){
        configurationKeyValuesRepository.save(configurationKeyValues);
    }

    public void updateConfigValue(String key,String value){
        configurationKeyValuesRepository.updateConfigValue(key, value);
    }

    public String getKeyForTeam(Long teamId){
        String teamName = teamRepository.getTeamNameByTeamId(teamId);
        Integer day = getIntegerConfigValue(teamName+"-day");
        Integer stage = getIntegerConfigValue(teamName+"-stage");
        Integer currentDay = getIntegerConfigValue("day");
        String imagePath = getStringConfigValue(teamName+"-img"+day); //this is not needed, as user is moved to stage 5 only
        if(currentDay >= day && stage == 5 && !imagePath.equals("")){      //     after image verification
            return getStringConfigValue("key"+day);
        }
        return "";
    }

    public String submitPassKeyAndMoveUserAhead(Long teamId, String passkey){
        String moveStatus = "rejected";
        String teamName = teamRepository.getTeamNameByTeamId(teamId);
        Integer stage = getIntegerConfigValue(teamName+"-stage");
        Integer day = getIntegerConfigValue(teamName+"-day");
        Integer currentDay = getIntegerConfigValue("day");
        String dayPassKey = getStringConfigValue("passkey-"+day);
        if(currentDay >= day && stage == 2 && dayPassKey.equalsIgnoreCase(passkey)){
            updateConfigValue(teamName+"-stage","3");
            moveStatus = "accepted";
        }
        return moveStatus;
    }

    public String reachCity(Long teamId){
        String moveStatus = "rejected";
        String teamName = teamRepository.getTeamNameByTeamId(teamId);
        Integer stage = getIntegerConfigValue(teamName+"-stage");
        if(stage == 1){
            configurationKeyValuesRepository.updateConfigValue(teamName+"-stage","2");
            moveStatus = "accepted";
        }
        return moveStatus;

    }

    public Boolean isMoveValid(Long teamId, Integer teamStage){
        Boolean isMoveValid = false;
        String teamName = teamRepository.getTeamNameByTeamId(teamId);
        Integer stage = getIntegerConfigValue(teamName+"-stage");
        if( stage == teamStage){
//            configurationKeyValuesRepository.updateConfigValue(teamName+"-stage",new Integer(stage+1).toString());
            isMoveValid = true;
        }
        return isMoveValid;
    }

}
