package com.gigsky.treasurehunt.model.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.gigsky.treasurehunt.model.dbbeans.TeamMembers;

import java.util.List;


@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class TeamInfo {

    @JsonProperty
    private String type="teamInfo";

    @JsonProperty
    private String name;

    @JsonProperty
    private List<TeamMembers>list;

    @JsonProperty
    private Long score;

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TeamMembers> getList() {
        return list;
    }

    public void setList(List<TeamMembers> list) {
        this.list = list;
    }
}
