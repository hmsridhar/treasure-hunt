package com.gigsky.treasurehunt.dao;

import com.gigsky.treasurehunt.model.dbbeans.TeamMembers;
import com.gigsky.treasurehunt.model.dbbeans.TeamMembersKey;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by harshams on 21/04/2020
 */
@Repository
public interface TeamMembersRepository extends CrudRepository<TeamMembers, TeamMembersKey> {

    List<TeamMembers> findTeamMembersByTeamMembersKey_TeamId(Long teamId);

}
