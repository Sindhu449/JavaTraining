package com.Infinite.day2;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.sno=101;
		s1.name="Sindhu";
		s1.city="atp";
		s1.cgp=72;
		
		Student s2 = new Student();
		s2.sno=102;
		s2.name="Hari";
		s2.city="mh";
		s2.cgp=90;
		
		Student s3 = new Student();
		s3.sno=103;
		s3.name="hk";
		s3.city="nrt";
		s3.cgp=85;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
