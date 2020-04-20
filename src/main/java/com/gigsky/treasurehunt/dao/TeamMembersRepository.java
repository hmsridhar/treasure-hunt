package com.gigsky.treasurehunt.dao;

import com.gigsky.treasurehunt.model.TeamMembers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

/**
 * Created by harshams on 21/04/2020
 */
@Repository
public interface TeamMembersRepository extends CrudRepository<TeamMembers,Long> {

    Iterable<TeamMembers> findAllByTeamId(Long teamId);
}
