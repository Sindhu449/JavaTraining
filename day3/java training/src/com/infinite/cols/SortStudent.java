package com.infinite.cols;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortStudent {

	public static void main(String[] args) {
		//Comparator c = new NameComparator1();
		Comparator c = new CityComparator();
		SortedSet studentList = new TreeSet(c);
		studentList.add(new Student(1,"sindhu","atp",96));
		studentList.add(new Student(2,"hari","atp",98));
		studentList.add(new Student(3,"manu","atp",96));
		studentList.add(new Student(4,"josh","atp",95));
		for (Object ob : studentList) {
			Student s1 = (Student)ob;
			System.out.println(s1);
					}
			
	}
	
}
