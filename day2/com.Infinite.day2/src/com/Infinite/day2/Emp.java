package com.Infinite.day2;

public class Emp {

	int empno;
	String name;
	double basic;
	
	public Emp() {
		
		// TODO Auto-generated constructor stub
	}
		@Override
	public String toString() {
		return "Emp [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}

	public Emp(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	
}
