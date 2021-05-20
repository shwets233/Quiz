package com.sample.Controller;

import com.sample.model.Quiz;
import com.sample.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class QuizController {
    @Autowired
    QuizRepository repo;

    @GetMapping
    public String getQuiz()(@PathVariable(quizid)int quizid)
    {
        return repo.findById(quizid).toString());
    }

    @PostMapping(path="/quiz",consume={"application/json"})
    {
        public Quiz addqQuiz(@RequestBody Quiz quiz)
        {
            repo.save(quiz);
            return quiz;
        }
    }
    @PutMapping(path="/quiz/quiz_id" consume={"application/json"}
    public Quiz saveorUpdateAlien(@RequestBody Quiz quiz)
            {
                repo.save(quiz);
                return quiz;
            }

}
