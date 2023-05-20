package com.library.test;

import java.util.Scanner;

import com.library.model.Book;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
     Book b = new Book();
     System.out.println("Enter book id");
     int bid=sc.nextInt();
     b.setBookid(bid);
     System.out.println("Enter book name");
     String bname=sc.next();
     b.setBookname(bname);
     System.out.println("Enter book author");
     String author = sc.next();
     b.setAuthor(author);
     System.out.println("Enter book availability");
      String avilability = sc.next();
      b.setAvailability(avilability);
     System.out.println(b);
	}

}
