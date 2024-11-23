package com.HQL;

import com.hibr.Question;
import org.example.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.management.Query;
import java.util.List;

public class HQLExample {
    public static void main(String[] args) {
        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
//  HQL syntax
        String query="from Student";
        Query q= (Query) session.createQuery(query);

        //single result -(unique)
        //multiple result -(multiple) list
//        List<Student> list=q.list();
//        now use foreach loop and print
//
        

        session.close();
        sessionFactory.close();
    }
}
