package com.gigsky.treasurehunt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by harshams on 21/04/2020
 */
@Entity
@Table(name = "team_members")
public class TeamMembers {

    @Id
    @Column(name = "team_id")
    private Long teamId;

    @Column
    private String name;

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
