package com.gigsky.treasurehunt.model.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.gigsky.treasurehunt.model.dbbeans.Question;
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class QuestionInfo {
    @JsonProperty
    private String type ="questionInfo";

    @JsonProperty
    private Long id;

    @JsonProperty
    private String text;

    @JsonProperty
    private boolean hasAnswered;

    @JsonProperty
    private String teamAnswer;




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isHasAnswered() {
        return hasAnswered;
    }

    public void setHasAnswered(boolean hasAnswered) {
        this.hasAnswered = hasAnswered;
    }

    public String getTeamAnswer() {
        return teamAnswer;
    }

    public void setTeamAnswer(String teamAnswer) {
        this.teamAnswer = teamAnswer;
    }
}
