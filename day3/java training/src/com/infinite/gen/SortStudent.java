package com.infinite.gen;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortStudent {

	public static void main(String[] args) {
		Comparator<Student> c = new NameComparator1();
		SortedSet<Student> studentList = new TreeSet<Student>(c);
		studentList.add(new Student(1,"sindhu","atp",96));
		studentList.add(new Student(2,"Sai Kunche","p",94));
		studentList.add(new Student(3,"nagamani","atp",93));
		studentList.add(new Student(4,"manjunatha","rdg",91));
		studentList.add(new Student(5,"sindhu","zkld",95));
        for (Student student : studentList) {
            System.out.println(student);			
		}
	}
}
