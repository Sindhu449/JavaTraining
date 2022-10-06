package com.Infinite.day2;

public class StudentArray {

	public static void main(String[] args) {
		Student[] arr = new Student[]{
				new Student(1,"manu","atp",65),
				new Student(2,"josh","atp",98),
				new Student(3,"Sin","atp",80),
				new Student(4,"kavi","nrt",75)
						};
		for(Student student : arr){
			System.out.println(student);
		}
	}
}
