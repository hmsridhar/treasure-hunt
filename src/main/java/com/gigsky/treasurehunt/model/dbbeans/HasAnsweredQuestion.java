package com.gigsky.treasurehunt.model.dbbeans;




import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "has_answered_question")

public class HasAnsweredQuestion implements Serializable {

    @EmbeddedId
    private TeamQuestion teamQuestion;

    @Column(name = "answer")
    private String answer;

    public TeamQuestion getTeamQuestion() {
        return teamQuestion;
    }

    public void setTeamQuestion(TeamQuestion teamQuestion) {
        this.teamQuestion = teamQuestion;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
