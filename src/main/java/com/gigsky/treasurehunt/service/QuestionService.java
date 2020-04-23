package com.gigsky.treasurehunt.service;

import com.gigsky.treasurehunt.dao.HasAnsweredQuestionRepository;
import com.gigsky.treasurehunt.dao.QuestionRepository;
import com.gigsky.treasurehunt.model.beans.Answer;
import com.gigsky.treasurehunt.model.beans.Clue;
import com.gigsky.treasurehunt.model.beans.QuestionInfo;
import com.gigsky.treasurehunt.model.dbbeans.HasAnsweredQuestion;
import com.gigsky.treasurehunt.model.dbbeans.Question;
import com.gigsky.treasurehunt.model.dbbeans.TeamQuestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    HasAnsweredQuestionRepository hasAnsweredQuestionRepository;

    @Autowired
    QuestionRepository questionRepository;

    public List<HasAnsweredQuestion> getAnsweredListForTeam(Long teamId){

        List<HasAnsweredQuestion>answeredQuestionsByTeam=
                hasAnsweredQuestionRepository.findHasAnsweredQuestionsByTeamQuestion_TeamId(teamId);
        return answeredQuestionsByTeam;
    }

    public QuestionInfo getQuestionInfo(Long teamId){
        Long questionId=1l;
        Question question=questionRepository.getQuestionById(questionId);
        boolean hasAnsweredQuestion=hasAnsweredQuestion(teamId,questionId);
        QuestionInfo questionInfo=new QuestionInfo();
        questionInfo.setId(question.getId());
        questionInfo.setText(question.getQuestion());
        questionInfo.setHasAnswered(hasAnsweredQuestion);
        return questionInfo;
    }

    public boolean hasAnsweredQuestion(Long teamId,Long questionId){
        TeamQuestion teamQuestion = new TeamQuestion();
        teamQuestion.setTeamId(teamId);
        teamQuestion.setQuestionId(questionId);
        HasAnsweredQuestion responseStatus=
                hasAnsweredQuestionRepository.findHasAnsweredQuestionsByTeamQuestion(teamQuestion);

        if(responseStatus==null){
            return false;
        }
        else
            return true;

    }

    public Clue getClue(Long questionId){
        Question question=questionRepository.getQuestionById(questionId);
        String questionClue=question.getClue();
        Clue clue=new Clue();
        clue.setClue(questionClue);
        return clue;
    }

    public boolean submitAnswer(Long questionId, Long teamId, Answer answer){
        try {
            String answerForQuestion = answer.getAnswer();
            TeamQuestion teamQuestion = new TeamQuestion();
            teamQuestion.setQuestionId(questionId);
            teamQuestion.setTeamId(teamId);
            HasAnsweredQuestion hasAnsweredQuestion = new HasAnsweredQuestion();
            hasAnsweredQuestion.setAnswer(answerForQuestion);
            hasAnsweredQuestion.setTeamQuestion(teamQuestion);
            hasAnsweredQuestionRepository.save(hasAnsweredQuestion);
            return true;
        }catch (Exception e){

        }
        return false;
    }



}
