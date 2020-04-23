package com.gigsky.treasurehunt.model.dbbeans;


import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by harshams on 20/04/2020
 */
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String role;

    @Column(name = "team_id")
    private Long teamId;

    @Column
    private String token;

    @Column(name = "token_expiry_time")
    private Timestamp tokenExpiryTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }


    public void setRole(String role) {
        this.role = role;
    }


    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }





    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Timestamp getTokenExpiryTime() {
        return tokenExpiryTime;
    }

    public void setTokenExpiryTime(Timestamp tokenExpiryTime) {
        this.tokenExpiryTime = tokenExpiryTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!id.equals(user.id)) return false;
        if (!username.equals(user.username)) return false;
        if (!password.equals(user.password)) return false;
        if (!role.equals(user.role)) return false;
        if (!teamId.equals(user.teamId)) return false;
        if (token != null ? !token.equals(user.token) : user.token != null) return false;
        return tokenExpiryTime != null ? tokenExpiryTime.equals(user.tokenExpiryTime) : user.tokenExpiryTime == null;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + username.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + role.hashCode();
        result = 31 * result + teamId.hashCode();
        result = 31 * result + (token != null ? token.hashCode() : 0);
        result = 31 * result + (tokenExpiryTime != null ? tokenExpiryTime.hashCode() : 0);
        return result;
    }
}
