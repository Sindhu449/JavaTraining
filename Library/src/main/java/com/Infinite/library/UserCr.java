package com.Infinite.library;

public class UserCr {
	
	private String userName;
	private String passWord;
	
	
	public UserCr(String userName, String passWord) {
	
		this.userName = userName;
		this.passWord = passWord;
	}


	public UserCr() {
		// TODO Auto-generated constructor stub
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassWord() {
		return passWord;
	}


	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}


	@Override
	public String toString() {
		return "User [userName=" + userName + ", passWord=" + passWord + "]";
	}
	
	

}