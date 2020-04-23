package com.gigsky.treasurehunt.model.dbbeans;

import javax.persistence.*;

/**
 * Created by harshams on 20/04/2020
 */
@Entity
@Table(name = "team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private Long score;

    @Column(name = "num_clues_taken")
    private Integer numClues;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public Integer getNumClues() {
        return numClues;
    }

    public void setNumClues(Integer numClues) {
        this.numClues = numClues;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Team team = (Team) o;

        if (!id.equals(team.id)) return false;
        if (name != null ? !name.equals(team.name) : team.name != null) return false;
        return score != null ? score.equals(team.score) : team.score == null;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        return result;
    }
}
