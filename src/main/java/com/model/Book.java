package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="BookStation")
public class Book {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name="BookID")
	private int id;
	
	@Column (name="Book_Name")
	private String bookname;
	
	@Column (name="Author")
	private String author;
	
	@Column (name="Book_Price")
	private double price;
	
	public Book() {
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Book(String bookname, String author, double price) {
		this.bookname = bookname;
		this.author = author;
		this.price = price;
	}
	
	
}
