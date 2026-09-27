package com.hbn.learning;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hbn.learning.entity.Employee;

public class Main {

	public static void main(String[] args) {
		Employee emp=new Employee("Deepanshu","Male",76000);
		
//		we'll  write any of these two condition but we give any thing execpt hibernate.cfg.xml this then we have give exact name otherwise error aayega 
		
		
//        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        Configuration cfg = new Configuration().configure();
        
        SessionFactory sessionFactory =cfg.buildSessionFactory();
        Session session =sessionFactory.openSession();
        
        Transaction transaction = session.beginTransaction();
        
        session.persist(emp);
        
        transaction.commit();

	}
	// hii everyone

}
