package com.gigsky.treasurehunt.service;

import com.gigsky.treasurehunt.dao.UserRepository;
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

}
