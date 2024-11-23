package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.println("This is me");
//        SessionFactory factory=new Configuration().configure().buildSessionFactory();
//
//        Session session=factory.openSession();
//        Student student=new Student(1,"ANUPAM","CITY");
//        Transaction transaction=session.beginTransaction();
//        session.save(student);
//        transaction.commit();
//        session.close();
        Address address=new Address();
        address.setCity("Deoria");
        address.setOpen(true);
        address.setStreet(28);
        address.setAddedDate(new Date());
        address.setX(88.99);

        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(address);
        transaction.commit();
        session.close();
//        System.out.println("Done");

        }
    }
