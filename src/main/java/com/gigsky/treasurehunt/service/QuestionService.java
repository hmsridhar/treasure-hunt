package com.gigsky.treasurehunt.service;

import com.gigsky.treasurehunt.dao.HasAnsweredQuestionRepository;
import com.gigsky.treasurehunt.dao.QuestionRepository;
import com.gigsky.treasurehunt.model.beans.Answer;
import com.gigsky.treasurehunt.model.beans.Clue;
import com.gigsky.treasurehunt.model.beans.QuestionInfo;
import com.gigsky.treasurehunt.model.beans.TeamQuestionAnswers;
import com.gigsky.treasurehunt.model.dbbeans.HasAnsweredQuestion;
import com.gigsky.treasurehunt.model.dbbeans.Question;
import com.gigsky.treasurehunt.model.dbbeans.TeamQuestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
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
            String teamAnswer = answer.getAnswer();
            //check if answer correct or wrong.If wrong return error msg , else save and return success msg.
            boolean ansCorrect=checkAnswer(teamAnswer,questionId);
            if(ansCorrect) {
                TeamQuestion teamQuestion = new TeamQuestion();
                teamQuestion.setQuestionId(questionId);
                teamQuestion.setTeamId(teamId);
                HasAnsweredQuestion hasAnsweredQuestion = new HasAnsweredQuestion();
                hasAnsweredQuestion.setAnswer(teamAnswer);
                hasAnsweredQuestion.setTeamQuestion(teamQuestion);
                hasAnsweredQuestionRepository.save(hasAnsweredQuestion);
                return true;
            }
            else{
                return false;
            }


        }catch (Exception e){

        }
        return false;
    }

    private boolean checkAnswer(String teamAnswer,Long id) {
        Question question=questionRepository.getQuestionById(id);

        String[] listOfAnswers=question.getAnswer().split(",");
        List<String> answersList= Arrays.asList(listOfAnswers);
        if(answersList.contains(teamAnswer.toLowerCase())){
            return true;
        }
        return  false;
    }


    public TeamQuestionAnswers getQuestionAnswersTeamInfo(Long teamId){
        try {
            Iterable<Question> questions = questionRepository.findAll();
            List<Question> questionList = new ArrayList<>();
            for (Question question : questions) {
                questionList.add(question);
            }

            int rightAnswers = 0;
            int wrongAnswers = 0;
            int day = 1;
            //int maxDay=config.getDay();
            List<QuestionInfo> questionInfoList = new ArrayList<>();
            for (Question question : questionList) {
                QuestionInfo questionInfo = new QuestionInfo();
                questionInfo.setId(question.getId());
                questionInfo.setText(question.getQuestion());

                HasAnsweredQuestion hasAnsweredQuestion = getPuzzleAnswerStatusTeam(teamId, question.getId());
                String teamAnswer = hasAnsweredQuestion.getAnswer();
                if (!teamAnswer.isEmpty()) {
                    boolean correctAnswer = checkAnswer(teamAnswer, question.getId());
                    if (correctAnswer) {
                        rightAnswers++;
                    } else {
                        wrongAnswers++;
                    }
                }
                questionInfo.setTeamAnswer(teamAnswer);
                questionInfoList.add(questionInfo);

            }

            TeamQuestionAnswers teamQuestionAnswers = new TeamQuestionAnswers();
            teamQuestionAnswers.setNumCorrectAns(Long.valueOf(rightAnswers));
            teamQuestionAnswers.setNumWrongAns(Long.valueOf(wrongAnswers));
            teamQuestionAnswers.setList(questionInfoList);

            return teamQuestionAnswers;
        }catch (Exception e){

        }
        return  null;

    }


    public HasAnsweredQuestion getPuzzleAnswerStatusTeam(Long teamId,Long questionId){
        TeamQuestion teamQuestion=new TeamQuestion();
        teamQuestion.setTeamId(teamId);
        teamQuestion.setQuestionId(questionId);
        HasAnsweredQuestion hasAnsweredQuestion=
                hasAnsweredQuestionRepository.findHasAnsweredQuestionsByTeamQuestion(teamQuestion);
        return hasAnsweredQuestion;
    }




}
