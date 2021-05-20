package com.sample.repository;

import com.sample.model.Quiz;

import java.util.ArrayList;
import java.util.List;

public class HibernateQuizRepositoryImpl implements QuizRepository {

    @Override
    public List<Quiz> findAll() {
        List<Quiz> quizzes = new ArrayList<Quiz>();

        Quiz quiz=new Quiz();
        int id=quiz.getQuiz_id();
        quiz.setDescription("Quiz-"+id);


        quizzes.add(quiz);

        return quizzes;
    }

}
