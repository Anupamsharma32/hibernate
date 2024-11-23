package com.hibr;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Question q1=new Question();
        q1.setQ_id(1212);
        q1.setQuestion("what is java");
        // creating answer object
        Answer answer=new Answer();
        answer.setA_id(343);
        answer.setAnswer("Programming language");
        q1.setAnswer(answer);
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        //save
        session.save(q1);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }

}
