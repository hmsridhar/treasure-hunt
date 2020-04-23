package com.gigsky.treasurehunt.model.dbbeans;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TeamPuzzle implements Serializable {

    @Column(name = "team_id")
    private Long teamId;

    @Column(name = "puzzle_id")
    private Long puzzleId;

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public Long getPuzzleId() {
        return puzzleId;
    }

    public void setPuzzleId(Long puzzleId) {
        this.puzzleId = puzzleId;
    }


    public TeamPuzzle() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamPuzzle teamPuzzle = (TeamPuzzle) o;
        return teamId.equals(teamPuzzle.teamId) &&
                puzzleId.equals(teamPuzzle.puzzleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamId,puzzleId);
    }


}
