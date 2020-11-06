package com.Test.Book;
/**
 * 图书类
 * @author Z
 *
 */
public class Book {
	private int id;//编号
	private String bookName;//名称
	private String author;//作者
	private double price;//价格
	
	public Book() {}
	
	public Book(String bookName,String author,double price) {
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
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
}
