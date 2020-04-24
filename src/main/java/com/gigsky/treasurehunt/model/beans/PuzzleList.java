package com.gigsky.treasurehunt.model.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gigsky.treasurehunt.model.dbbeans.Puzzle;

import java.util.List;

public class PuzzleList {

    @JsonProperty
    private String type="puzzleList";
    @JsonProperty
    List<PuzzleInfo>list;

    public List<PuzzleInfo> getList() {
        return list;
    }

    public void setList(List<PuzzleInfo> list) {
        this.list = list;
    }
}
