package com.gigsky.treasurehunt.model.dbbeans;

import com.gigsky.treasurehunt.model.beans.PuzzleType;

import javax.persistence.*;

/**
 * Created by harshams on 21/04/2020
 */
@Entity
@Table(name = "puzzle")
public class Puzzle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    @Enumerated(EnumType.STRING)
    private PuzzleType type;

    @Column
    private String question;

    @Column
    private String filename;

    @Column
    private Long points;

    @Column
    private String answer;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

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
}
