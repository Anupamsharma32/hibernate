package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
    public static void main(String[] args) {
        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        Student s=new Student();
        s.setId(4);
        s.setCity("Deoria");
        s.setName("Anupam");
        Certificate certificate=new Certificate();
        certificate.setCource("android");
        certificate.setDuration("2 Month");
        s.setCertificate(certificate);
        Transaction transaction=session.beginTransaction();
        session.save(s);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
