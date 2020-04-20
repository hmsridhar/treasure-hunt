package com.gigsky.treasurehunt.dao;

import com.gigsky.treasurehunt.model.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by harshams on 20/04/2020
 */
@Repository
public interface TeamRepository extends CrudRepository<Team,Long> {

}
