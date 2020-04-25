package com.gigsky.treasurehunt.dao;

import com.gigsky.treasurehunt.model.dbbeans.Question;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<Question,Long> {
    Question getQuestionById(Long id);

    Question getQuestionByDay(Integer day);

}
