package com.onetomanymanytoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        Question1 question=new Question1();
        question.setQ_id(22);
        question.setQuestion("What is java");

        Answer1 answer1=new Answer1();
        answer1.setA_id(33);
        answer1.setAnswer("Java is high level Programming language");
        answer1.setQuestion(question);

        Answer1 answer2=new Answer1();
        answer2.setA_id(66);
        answer2.setAnswer("Java supports oops");
        answer2.setQuestion(question);

        List<Answer1> list=new ArrayList<>();
        list.add(answer1);
        list.add(answer2);

        question.setAnswer(list);

        session.save(question);


        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
