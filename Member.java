package com.library.model;

public class Member {
 private int memberId;
 private String memberName;
 private String bookborrowed;
 private String returnstatus;
 public Member() {}
 @Override
public String toString() {
	return "Member [memberId=" + memberId + ", memberName=" + memberName + ", bookborrowed=" + bookborrowed
			+ ", returnstatus=" + returnstatus + "]";
}
public Member(int memberId, String memberName, String bookborrowed, String returnstatus) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.bookborrowed = bookborrowed;
		this.returnstatus = returnstatus;
	}
public int getMemberId() {
	return memberId;
}
public void setMemberId(int memberId) {
	this.memberId = memberId;
}
public String getMemberName() {
	return memberName;
}
public void setMemberName(String memberName) {
	this.memberName = memberName;
}
public String getBookborrowed() {
	return bookborrowed;
}
public void setBookborrowed(String bookborrowed) {
	this.bookborrowed = bookborrowed;
}
public String getReturnstatus() {
	return returnstatus;
}
public void setReturnstatus(String returnstatus) {
	this.returnstatus = returnstatus;
}

 
}
