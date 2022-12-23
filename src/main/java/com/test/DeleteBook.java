package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Book;

public class DeleteBook {

	public static void main(String[] args) {
		Configuration con=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
		Book book=session.load(Book.class, 4);
		session.delete(book);
		
		session.getTransaction().commit();
		session.close();
		factory.close();
	}
}
