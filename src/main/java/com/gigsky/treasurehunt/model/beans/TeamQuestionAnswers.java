package com.gigsky.treasurehunt.model.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.List;
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class TeamQuestionAnswers {
    @JsonProperty
    private String type="questionAnswers";

    @JsonProperty
    private Long numCorrectAns=0L;

    @JsonProperty
    private Long numWrongAns=0L;

    @JsonProperty
    private List<QuestionInfo> list;

    public Long getNumCorrectAns() {
        return numCorrectAns;
    }

    public void setNumCorrectAns(Long numCorrectAns) {
        this.numCorrectAns = numCorrectAns;
    }

    public Long getNumWrongAns() {
        return numWrongAns;
    }

    public void setNumWrongAns(Long numWrongAns) {
        this.numWrongAns = numWrongAns;
    }

    public List<QuestionInfo> getList() {
        return list;
    }

    public void setList(List<QuestionInfo> list) {
        this.list = list;
    }
}
