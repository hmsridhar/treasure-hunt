package com.gigsky.treasurehunt.model.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class Clue {
    @JsonProperty
    private String type="clue";

    @JsonProperty
    private String clue;

    public String getClue() {
        return clue;
    }

    public void setClue(String clue) {
        this.clue = clue;
    }
}
