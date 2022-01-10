package com.capgemini.librarymanagement.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int book_id;
	private int book_callno;
	private String book_name;
	private String book_author;
	private String book_publisher;
	private int book_quantity;
    private int book_issued;
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public int getBook_callno() {
		return book_callno;
	}
	public void setBook_callno(int book_callno) {
		this.book_callno = book_callno;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	public String getBook_publisher() {
		return book_publisher;
	}
	public void setBook_publisher(String book_publisher) {
		this.book_publisher = book_publisher;
	}
	public int getBook_quantity() {
		return book_quantity;
	}
	public void setBook_quantity(int book_quantity) {
		this.book_quantity = book_quantity;
	}
	public int getBook_issued() {
		return book_issued;
	}
	public void setBook_issued(int book_issued) {
		this.book_issued = book_issued;
	}
    
	

}
