package com.gigsky.treasurehunt.dao;

import com.gigsky.treasurehunt.model.dbbeans.ConfigurationKeyValues;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by harshams on 24/04/2020
 */
public interface ConfigurationKeyValuesRepository extends JpaRepository<ConfigurationKeyValues,String> {

    ConfigurationKeyValues findByKey(String key);
}
