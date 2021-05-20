package com.sample.repository;

import com.sample.model.Quiz;


import java.util.List;

public interface QuizRepository extends CrudRepository<Quiz,Long> {
    List<Quiz> findAll();
}
