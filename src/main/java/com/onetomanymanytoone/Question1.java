package com.onetomanymanytoone;


import javax.persistence.*;
import java.util.List;

@Entity
public class Question1 {
    @Id
    @Column(name="question_id")
    private int q_id;
    private String question;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Answer1> answer;


    @OneToMany
    public List<Answer1> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer1> answer) {
        this.answer = answer;
    }

    public int getQ_id() {
        return q_id;
    }

    public void setQ_id(int q_id) {
        this.q_id = q_id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
