package com.orm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Read {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// System.out.println(factory);

		Session session = factory.openSession();
		
		System.out.println("Fetching object using get:");
		Student s1 = session.get(Student.class, 101);
		System.out.println(s1);
		System.out.println("Fetching object using load:");
		Student s2 = session.load(Student.class, 101);
		System.out.println(s2);
		
		session.close();
	}

}
