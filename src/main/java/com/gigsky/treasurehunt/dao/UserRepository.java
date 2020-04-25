package com.gigsky.treasurehunt.dao;

import com.gigsky.treasurehunt.model.dbbeans.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by harshams on 20/04/2020
 */
@Repository
public interface UserRepository extends CrudRepository<User,Long> {

    User findByUsernameAndPassword(String username, String password);

    User findByUsername(String username);

    Boolean existsByUsernameAndTeamId(String username, Long teamId);

    @Query("select token from User where username = :username")
    String getTokenByUsername(@Param("username") String username);
}
