package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.model.Book;

public class InsertBook {

	public static void main(String[] args) {
// 
//		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
//		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		
		Configuration con=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();

//		Book book = new Book("Dark Hour", "Me", 2500);
		Book book = new Book("Ice & Fire", "Dragons", 150000);

		session.save(book);

		session.getTransaction().commit();

		session.close();
		factory.close();
	}

}
