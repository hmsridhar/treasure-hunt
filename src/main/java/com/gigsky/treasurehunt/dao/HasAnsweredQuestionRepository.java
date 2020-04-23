package com.gigsky.treasurehunt.dao;

import com.gigsky.treasurehunt.model.dbbeans.HasAnsweredQuestion;
import com.gigsky.treasurehunt.model.dbbeans.TeamQuestion;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HasAnsweredQuestionRepository extends CrudRepository<HasAnsweredQuestion, TeamQuestion> {
        //List<HasAnsweredQuestion> findHasAnsweredQuestionsByTeamId(Long teamId);

        List<HasAnsweredQuestion> findHasAnsweredQuestionsByTeamQuestion_TeamId(Long teamId);

        HasAnsweredQuestion findHasAnsweredQuestionsByTeamQuestion(Long teamId,Long questionId);


}
