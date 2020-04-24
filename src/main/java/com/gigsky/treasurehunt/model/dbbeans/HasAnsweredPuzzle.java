package com.gigsky.treasurehunt.model.dbbeans;



import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "has_answered_puzzle")

public class HasAnsweredPuzzle implements Serializable {

    @EmbeddedId
    private TeamPuzzle teamPuzzle;

    @Column(name = "answer")
    private String answer;

    @Column(name = "attempts")
    private Long attempts;

    @Column(name = "has_answered")
    private boolean hasAnswered;

    public TeamPuzzle getTeamPuzzle() {
        return teamPuzzle;
    }

    public void setTeamPuzzle(TeamPuzzle teamPuzzle) {
        this.teamPuzzle = teamPuzzle;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Long getAttempts() {
        return attempts;
    }

    public void setAttempts(Long attempts) {
        this.attempts = attempts;
    }

    public boolean isHasAnswered() {
        return hasAnswered;
    }

    public void setHasAnswered(boolean hasAnswered) {
        this.hasAnswered = hasAnswered;
    }
}
