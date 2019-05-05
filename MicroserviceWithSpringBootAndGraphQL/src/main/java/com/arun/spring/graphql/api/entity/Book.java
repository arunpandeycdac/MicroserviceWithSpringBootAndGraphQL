package com.arun.spring.graphql.api.entity;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Book {
	@Id
	private String bookId;
	private String bookName;
	private String publishedDate;
	private String[] writer;
	private String publisher;
	
	public Book(){}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}

	public String[] getWriter() {
		return writer;
	}

	public void setWriter(String[] writer) {
		this.writer = writer;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", publishedDate=" + publishedDate + ", writer="
				+ Arrays.toString(writer) + ", publisher=" + publisher + "]";
	}

	public Book(String bookId, String bookName, String publishedDate, String[] writer, String publisher) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.publishedDate = publishedDate;
		this.writer = writer;
		this.publisher = publisher;
	}
}
