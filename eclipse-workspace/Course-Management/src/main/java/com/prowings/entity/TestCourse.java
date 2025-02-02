package com.prowings.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.prowings.utils.HibernateUtils;

public class TestCourse {

	public static void main(String[] args) {

		Course course1 = new Course("Java Programming", 12, 50000L);
		Course course2 = new Course("Data Structure", 7, 45000L);
		Course course3 = new Course("Software Testing", 10, 55000L);

		OnlineCourse onlinecourse = new OnlineCourse("Java Programming", 12, 50000L, "Udemy", 12);
		OfflineCourse offlinecourse = new OfflineCourse("Data Structure", 5, 45000L, "Mumbai", 9);

		SessionFactory sessionfactory = HibernateUtils.getSessionFactoryObj();
		Session session = sessionfactory.openSession();
		Transaction txn = session.beginTransaction();

		session.save(course1);
		session.save(course2);
		session.save(course3);

		session.save(onlinecourse);
		session.save(offlinecourse);
		txn.commit();
		session.close();
	}

}
