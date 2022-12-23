package com.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Book;

public class GetAllBooks {
	public static void main(String[] args) {

		Configuration con=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
		List <Book> list=session.createQuery("from Book").list();
		for (Book book : list) {
			System.out.println(book.getId());
			System.out.println(book.getBookname());
			System.out.println(book.getAuthor());
			System.out.println(book.getPrice());
			System.out.println("=========");
		}
		
		session.getTransaction().commit();
		session.close();
		factory.close();
	}
}
