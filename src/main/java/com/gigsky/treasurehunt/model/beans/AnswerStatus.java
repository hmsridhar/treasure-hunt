package com.gigsky.treasurehunt.model.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.gigsky.treasurehunt.model.dbbeans.HasAnsweredPuzzle;
import com.gigsky.treasurehunt.model.dbbeans.HasAnsweredQuestion;

import java.util.List;


@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class AnswerStatus {

    @JsonProperty
    private List<HasAnsweredPuzzle>answeredPuzzles;
    @JsonProperty
    private List<HasAnsweredQuestion> answeredQuestions;

    public List<HasAnsweredPuzzle> getAnsweredPuzzles() {
        return answeredPuzzles;
    }

    public void setAnsweredPuzzles(List<HasAnsweredPuzzle> answeredPuzzles) {
        this.answeredPuzzles = answeredPuzzles;
    }

    public List<HasAnsweredQuestion> getAnsweredQuestions() {
        return answeredQuestions;
    }

    public void setAnsweredQuestions(List<HasAnsweredQuestion> answeredQuestions) {
        this.answeredQuestions = answeredQuestions;
    }
}
