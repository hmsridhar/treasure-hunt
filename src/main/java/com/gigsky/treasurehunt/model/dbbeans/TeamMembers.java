package com.gigsky.treasurehunt.model.dbbeans;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by harshams on 21/04/2020
 */
@Entity
@Table(name = "team_members")

public class TeamMembers implements Serializable {

    @EmbeddedId
    TeamMembersKey teamMembersKey;


    public TeamMembersKey getTeamMembersKey() {
        return teamMembersKey;
    }

    public void setTeamMembersKey(TeamMembersKey teamMembersKey) {
        this.teamMembersKey = teamMembersKey;
    }
}
