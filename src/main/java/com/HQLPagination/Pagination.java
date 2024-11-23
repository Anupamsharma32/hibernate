package com.HQLPagination;

import org.example.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

//import javax.management.Query;

public class Pagination {
    public static void main(String[] args) {
        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        Query query=session.createQuery("from Student");
        //implementing pagination using hibertnate
        query.setFirstResult(0);
        query.setMaxResults(5);
        List<Student> list=query.list();
         for(Student st:list){
             System.out.println(st.getCity());
         }


        session.close();
        sessionFactory.close();
    }
}
