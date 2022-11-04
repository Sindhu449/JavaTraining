package com.infinite.canteen;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="restaurant")
public class Restaurant {
	
	@Id
	@Column(name="rest_id")
	private String resturantId;
	@Column(name="rest_name")
	private String name;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	@Column(name="pincode")
	private int pincode;
	@Column(name="rest_email")
	private String email;
	@Column(name="rest_mob_no")
	private int mobileno;
	@Column(name="rest_userName")
	private String username;
	@Column(name="rest_password")
	private String password;
	
	
	
	public String getResturantId() {
		return resturantId;
	}
	public void setResturantId(String resturantId) {
		this.resturantId = resturantId;
	}
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobileno() {
		return mobileno;
	}
	public void setMobileno(String molibleno) {
		this.mobileno = mobileno;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Resturant [resturantId=" + resturantId + ", name=" + name + ", city=" + city + ", state=" + state
				+ ", pincode=" + pincode + ", email=" + email + ", mobileno=" + mobileno + ", username=" + username
				+ ", password=" + password + "]";
	}
	

}
