package com.infinite.gen;

import java.util.ArrayList;
import java.util.List;

import com.infinite.cols.Student;

public class StudentList {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1,"sindhu","atp",96));
		studentList.add(new Student(1,"Sai Kunche","p",94));
		studentList.add(new Student(1,"nagamani","atp",93));
		studentList.add(new Student(1,"manjunatha","rdg",91));
		studentList.add(new Student(1,"sindhu","zkld",95));
		for (Student student : studentList) {
			System.out.println(student);
			
		}
	}
}
