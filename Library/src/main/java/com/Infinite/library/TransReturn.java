package com.Infinite.library;

import java.sql.Date;

public class TransReturn {
	
	private String userName;
	private int bookId;
	private Date fromdate;
	private Date toDate;

	
	public TransReturn() {
		
		// TODO Auto-generated constructor stub
	}


	public TransReturn(String userName, int bookId, Date fromdate, Date toDate) {

		this.userName = userName;
		this.bookId = bookId;
		this.fromdate = fromdate;
		this.toDate = toDate;
	}


	@Override
	public String toString() {
		return "TransReturn [userName=" + userName + ", bookId=" + bookId + ", fromdate=" + fromdate + ", toDate="
				+ toDate + "]";
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public Date getFromdate() {
		return fromdate;
	}


	public void setFromdate(Date fromdate) {
		this.fromdate = fromdate;
	}


	public Date getToDate() {
		return toDate;
	}


	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	
	
	

}