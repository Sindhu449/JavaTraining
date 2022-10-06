package com.Infinite.day2;

public class Student {

	int sno;
	String name;
	String city;
	double cgp;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", city=" + city + ", cgp=" + cgp + "]";
	}

	public Student(int sno, String name, String city, double cgp) {
		super();
		this.sno = sno;
		this.name = name;
		this.city = city;
		this.cgp = cgp;
	}
	
	
}
