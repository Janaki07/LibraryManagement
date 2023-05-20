package com.library.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.library.dao.BookDAO;
import com.library.model.Book;
import com.library.model.Member;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
     Book b = new Book();
     Member m= new Member();
     BookDAO bd = new BookDAO();
    System.out.println("Enter book name : ");
    String bname=sc.next();
    b.setBookname(bname);
    System.out.println("Enter book id : ");
    int bid=sc.nextInt();
    b.setBookid(bid);
    System.out.println("Enter book author : ");
    String author = sc.next();
b.setAuthor(author);
    System.out.println("Enter book avilability status : ");
    String avilability = sc.next();
    b.setAvailability(avilability);

     System.out.println("Enter member id");
     int mid=sc.nextInt();
     m.setMemberId(mid);
     System.out.println("Enter member name");
     String mname=sc.next();
     m.setMemberName(mname);
     System.out.println("Enter bookborrowed");
     int bookborrowed = sc.nextInt();
     m.setBookborrowedid(bookborrowed);
     System.out.println("Enter returnstatus");
      String returnstatus = sc.next();
      m.setReturnstatus(returnstatus);
     System.out.println(b);
     List<Book> bookList = new ArrayList<>();
     bookList.add(b);
     List<Member> MemberList = new ArrayList<>();
     MemberList.add(m);
     bd.addMember(bookList,MemberList );
	}

}
