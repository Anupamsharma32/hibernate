package com.manytomany;

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
        Emp emp1=new Emp();
        Emp emp2=new Emp();
        Project project1=new Project();
        Project project2=new Project();

        emp1.setE_id(1);
        emp1.setEmp_name("ANUPAM");

        emp2.setE_id(2);
        emp2.setEmp_name("SHARMA");

        project1.setId(4);
        project1.setP_name("JAVA");

        project2.setId(6);
        project2.setP_name("C++");

        List<Project> list2=new ArrayList<>();
        List<Emp> list1=new ArrayList<>();

        list1.add(emp1);
        list1.add(emp2);

        list2.add(project1);
        list2.add(project2);

        emp1.setProjects(list2);
        project2.setEmps(list1);
        session.save(emp1);
        session.save(emp2);
        session.save(project1);
        session.save(project2);


        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
