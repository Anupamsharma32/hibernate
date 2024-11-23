package com.onetomanymanytoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer1 {
    @Id
    private int a_id;
    private String answer;
    @ManyToOne
    private Question1 question;

    public int getA_id() {
        return a_id;
    }

    public void setA_id(int a_id) {
        this.a_id = a_id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Question1 getQuestion() {
        return question;
    }

    public void setQuestion(Question1 question) {
        this.question = question;
    }
}
