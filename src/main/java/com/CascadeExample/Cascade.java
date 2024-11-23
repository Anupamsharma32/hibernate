package com.CascadeExample;

import com.onetomanymanytoone.Answer1;
import com.onetomanymanytoone.Question1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Cascade {
    public static void main(String[] args) {
        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();

        Question1 question1=new Question1();
        question1.setQ_id(900);
        question1.setQuestion("What is Cascading");

        Answer1 answer1=new Answer1();
        Answer1 answer2=new Answer1();
        answer1.setA_id(3334);
        answer2.setA_id(344);
        answer1.setAnswer("In hibernate it is important concept");
        answer2.setAnswer("In hibernate it is important concept");
        List<Answer1> list=new ArrayList<>();
        list.add(answer1);
        list.add(answer2);

        question1.setAnswer(list);
        Transaction transaction=session.beginTransaction();
        session.save(question1);
        transaction.commit();
        session.close();
        sessionFactory.close();




    }
}
