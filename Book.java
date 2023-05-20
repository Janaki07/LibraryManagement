package com.library.model;

public class Book {
   private String bookname;
   private int bookid;
   private String author;
   private String availability;
   public Book() {}
   
@Override
public String toString() {
	return "Book [bookname=" + bookname + ", bookid=" + bookid + ", author=" + author + ", availability=" + availability
			+ "]";
}

public Book(String bookname, int bookid, String author, String availability) {
	super();
	this.bookname = bookname;
	this.bookid = bookid;
	this.author = author;
	this.availability = availability;
}

public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getAvailability() {
	return availability;
}
public void setAvailability(String availability) {
	this.availability = availability;
}
   
}
