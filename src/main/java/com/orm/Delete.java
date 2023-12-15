package com.orm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete {

	public static void main(String[] args) {
		System.out.println("Delete Operation Started....");

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Student s = session.get(Student.class, 105);
		session.delete(s);

		tx.commit();
		session.close();
	}

}
