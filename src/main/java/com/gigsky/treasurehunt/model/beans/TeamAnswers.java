package com.gigsky.treasurehunt.model.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class TeamAnswers {
    @JsonProperty
    private TeamPuzzleAnswers teamPuzzleAnswers;

    @JsonProperty
    private TeamQuestionAnswers teamQuestionAnswers;

    public TeamPuzzleAnswers getTeamPuzzleAnswers() {
        return teamPuzzleAnswers;
    }

    public void setTeamPuzzleAnswers(TeamPuzzleAnswers teamPuzzleAnswers) {
        this.teamPuzzleAnswers = teamPuzzleAnswers;
    }

    public TeamQuestionAnswers getTeamQuestionAnswers() {
        return teamQuestionAnswers;
    }

    public void setTeamQuestionAnswers(TeamQuestionAnswers teamQuestionAnswers) {
        this.teamQuestionAnswers = teamQuestionAnswers;
    }
}
