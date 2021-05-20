package com.sample.service;

import com.sample.model.Quiz;
import com.sample.repository.HibernateQuizRepositoryImpl;
import com.sample.repository.QuizRepository;

import java.util.List;

public class QuizServiceImpl implements QuizService {

    private QuizRepository repository =new HibernateQuizRepositoryImpl();

    @Override
    public List<Quiz> findAll(){
        return repository.findAll();
    }
}
