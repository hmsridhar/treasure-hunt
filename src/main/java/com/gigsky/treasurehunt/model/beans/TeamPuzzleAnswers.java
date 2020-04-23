package com.gigsky.treasurehunt.model.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.List;
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class TeamPuzzleAnswers {

    @JsonProperty
    private String type="puzzleAnswers";
    @JsonProperty
    private Long numcorrectAns=0L;
    @JsonProperty
    private Long numWrongAns=0L;
    @JsonProperty
    private List<PuzzleInfo> list;

    public Long getNumcorrectAns() {
        return numcorrectAns;
    }

    public void setNumcorrectAns(Long numcorrectAns) {
        this.numcorrectAns = numcorrectAns;
    }

    public Long getNumWrongAns() {
        return numWrongAns;
    }

    public void setNumWrongAns(Long numWrongAns) {
        this.numWrongAns = numWrongAns;
    }

    public List<PuzzleInfo> getList() {
        return list;
    }

    public void setList(List<PuzzleInfo> list) {
        this.list = list;
    }
}
