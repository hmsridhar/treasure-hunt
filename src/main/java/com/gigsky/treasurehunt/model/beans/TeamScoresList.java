package com.gigsky.treasurehunt.model.beans;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.List;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class TeamScoresList {
    @JsonProperty
    private String type="teamScoresList";

    @JsonProperty
    private List<TeamScore> list;

    public List<TeamScore> getList() {
        return list;
    }

    public void setList(List<TeamScore> list) {
        this.list = list;
    }
}








