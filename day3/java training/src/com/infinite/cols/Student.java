package com.infinite.cols;

public class Student {

	int sno;
	String name;
	String city;
	double cgpa;
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", city=" + city + ", cgpa=" + cgpa + "]";
	}
	public Student(int sno, String name, String city, double cgpa) {
		super();
		this.sno = sno;
		this.name = name;
		this.city = city;
		this.cgpa = cgpa;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
