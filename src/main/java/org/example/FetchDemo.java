package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
    public static void main(String[] args) {
        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        //get()
        Student student=(Student) session.get(Student.class,1);
        System.out.println(student);
        session.close();
        sessionFactory.close();
//        similarly load()
    }
}
