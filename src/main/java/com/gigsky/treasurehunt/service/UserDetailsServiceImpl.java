package com.gigsky.treasurehunt.service;

import com.gigsky.treasurehunt.dao.UserRepository;

import com.gigsky.treasurehunt.model.dbbeans.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by harshams on 21/04/2020
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if(user !=null) {
            List<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
            String[] authStrings = user.getRole().split(",");
            for(String authString : authStrings) {
                authorities.add(new SimpleGrantedAuthority("ROLE_"+authString));
            }
            return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), authorities);
        }

        // If user not found. Throw this exception.
        throw new UsernameNotFoundException("Username: " + username + " not found");
    }

    public User getUserByUserName(String username){
        return userRepository.findByUsername(username);
    }

    public void addOrUpdateUser(User user){
        userRepository.save(user);
    }

}
