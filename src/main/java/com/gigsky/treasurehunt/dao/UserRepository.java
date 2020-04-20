package com.gigsky.treasurehunt.dao;

import com.gigsky.treasurehunt.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by harshams on 20/04/2020
 */
@Repository
public interface UserRepository extends CrudRepository<User,Long> {

    User findByUsernameAndPassword(String username, String password);
}
