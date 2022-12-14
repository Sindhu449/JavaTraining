package com.java.ejb;

import java.io.Serializable;

public class User implements Serializable {
		
	   private int userid;
	   private String username;
	   private String PassCode;
	   private String firstname;
	   private String lastname;
	   private String city;
	   private String state;
	   private String mobile;
	   private String email;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassCode() {
		return PassCode;
	}
	public void setPassCode(String passCode) {
		PassCode = passCode;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", PassCode=" + PassCode + ", firstname="
				+ firstname + ", lastname=" + lastname + ", city=" + city + ", state=" + state + ", mobile=" + mobile
				+ ", email=" + email + "]";
	}
	public User(int userid, String username, String passCode, String firstname, String lastname, String city,
			String state, String mobile, String email) {
		super();
		this.userid = userid;
		this.username = username;
		PassCode = passCode;
		this.firstname = firstname;
		this.lastname = lastname;
		this.city = city;
		this.state = state;
		this.mobile = mobile;
		this.email = email;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	   

}
