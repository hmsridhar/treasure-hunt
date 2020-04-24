package com.gigsky.treasurehunt.dao;

import com.gigsky.treasurehunt.model.dbbeans.ConfigurationKeyValues;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by harshams on 24/04/2020
 */
@Transactional
public interface ConfigurationKeyValuesRepository extends JpaRepository<ConfigurationKeyValues,String> {

    ConfigurationKeyValues findByKey(String key);

    @Modifying
    @Query("update ConfigurationKeyValues set value = :value where ckey = :ckey")
    int updateConfigValue(@Param("ckey")String key, @Param("value")String value);
}
