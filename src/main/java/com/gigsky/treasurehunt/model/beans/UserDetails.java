package com.gigsky.treasurehunt.model.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Created by harshams on 25/04/2020
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class UserDetails {

    @JsonProperty
    private String type = "userDetails";

    @JsonProperty
    private String username;

    @JsonProperty
    private String teamName;

    @JsonProperty
    private String token;

    @JsonProperty
    private Long teamId;

    @JsonProperty
    private String hint;

    @JsonProperty
    private Long lastUpdatedScore;

    @JsonProperty
    private Integer currentDay;

    @JsonProperty
    private Integer teamDay;

    @JsonProperty
    private Integer teamStage;

    @JsonProperty
    private String teamImageUploadStatus;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public Long getLastUpdatedScore() {
        return lastUpdatedScore;
    }

    public void setLastUpdatedScore(Long lastUpdatedScore) {
        this.lastUpdatedScore = lastUpdatedScore;
    }

    public Integer getCurrentDay() {
        return currentDay;
    }

    public void setCurrentDay(Integer currentDay) {
        this.currentDay = currentDay;
    }

    public Integer getTeamDay() {
        return teamDay;
    }

    public void setTeamDay(Integer teamDay) {
        this.teamDay = teamDay;
    }

    public Integer getTeamStage() {
        return teamStage;
    }

    public void setTeamStage(Integer teamStage) {
        this.teamStage = teamStage;
    }

    public String getTeamImageUploadStatus() {
        return teamImageUploadStatus;
    }

    public void setTeamImageUploadStatus(String teamImageUploadStatus) {
        this.teamImageUploadStatus = teamImageUploadStatus;
    }
}
