package com.gigsky.treasurehunt.model.beans;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class PuzzleInfo {

    @JsonProperty
    private Long id;

    @JsonProperty
    private PuzzleType type;

    @JsonProperty
    private String question;

    @JsonProperty
    private String filename;

    @JsonProperty
    private Long points;

    @JsonProperty
    private String teamAnswer;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PuzzleType getType() {
        return type;
    }

    public void setType(PuzzleType type) {
        this.type = type;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Long getPoints() {
        return points;
    }

    public void setPoints(Long points) {
        this.points = points;
    }


    public String getTeamAnswer() {
        return teamAnswer;
    }

    public void setTeamAnswer(String teamAnswer) {
        this.teamAnswer = teamAnswer;
    }
}
