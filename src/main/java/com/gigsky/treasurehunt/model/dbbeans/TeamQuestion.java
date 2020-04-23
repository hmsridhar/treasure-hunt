package com.gigsky.treasurehunt.model.dbbeans;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TeamQuestion implements Serializable {

    @Column(name = "team_id")
    private Long teamId;

    @Column(name = "question_id")
    private Long questionId;

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public TeamQuestion() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamQuestion teamQuestion = (TeamQuestion) o;
        return teamId.equals(teamQuestion.teamId) &&
                questionId.equals(teamQuestion.questionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamId,questionId);
    }



}
