package com.gigsky.treasurehunt.service;

import com.gigsky.treasurehunt.dao.ConfigurationKeyValuesRepository;
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

    public String getStringConfigValue(String key){
        ConfigurationKeyValues configurationKeyValues = configurationKeyValuesRepository.findByKey(key);
        return configurationKeyValues == null ? null : configurationKeyValues.getValue();
    }

    public Integer getIntegerConfigValue(String key){
        ConfigurationKeyValues configurationKeyValues = configurationKeyValuesRepository.findByKey(key);
        return configurationKeyValues == null ? null : Integer.parseInt(configurationKeyValues.getValue());
    }

}
