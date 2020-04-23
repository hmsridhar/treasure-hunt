package com.gigsky.treasurehunt.model.dbbeans;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TeamMembersKey implements Serializable {
    @Column(name = "team_id")
    private Long teamId;

    @Column(name = "name")
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


    public TeamMembersKey() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamMembersKey teamMembersKey = (TeamMembersKey) o;
        return teamId.equals(teamMembersKey.teamId) &&
                name.equals(teamMembersKey.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamId,name);
    }
}
