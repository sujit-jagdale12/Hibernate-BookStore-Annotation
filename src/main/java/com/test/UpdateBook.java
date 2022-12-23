package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Book;

public class UpdateBook {

	public static void main(String[] args) {
		Configuration con=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();

		Book book=session.get(Book.class, 5);
		book.setPrice(3500);
		book.setAuthor("King");

		session.getTransaction().commit();
		session.close();
		factory.close();
	}
}
