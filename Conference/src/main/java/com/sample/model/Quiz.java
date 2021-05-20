package com.sample.model;
/*
public class Speaker {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}*/

import com.sun.javafx.beans.IDProperty;

import java.util.ArrayList;
import java.util.List;

public class Quiz {

    public int getQuiz_id() {
        return quiz_id;
    }

    public void setQuiz_id(int quiz_id) {
        this.quiz_id = quiz_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Questions getType() {
        return type;
    }

    public void setType(Questions type) {
        this.type = type;
    }



    private int quiz_id;
    private String description;
    private int ques_id=getQuiz_id();
    public ArrayList<Questions> list=new ArrayList<Questions>();

    Questions type;

}
