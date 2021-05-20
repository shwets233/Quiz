package com.sample.model;

import java.util.Set;

public class Questions {

    private int question_no;
    private String question_desc;
    enum type {MULTIPLE_CHOICE, SUBJECTIVE};
    private String answer_Describe;

    private Set<Answer> answers;




}
