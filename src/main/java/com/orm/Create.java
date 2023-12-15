package com.orm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Create {
	public static void main(String[] args) {
		System.out.println("Project Started....");

		// SessionFactory factory=new Configuration().configure().buildSessionFactory();

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// System.out.println(factory);

		// creating student
		Student st = new Student();
		st.setId(104);
		st.setName("kartik r");
		st.setCity("hinganghat");
		System.out.println(st);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(st);
		tx.commit();
		session.close();
	}
}
