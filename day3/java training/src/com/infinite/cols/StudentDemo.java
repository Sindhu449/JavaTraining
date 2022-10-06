package com.infinite.cols;

import java.util.ArrayList;
import java.util.List;

public class StudentDemo {

	public static void main(String[] args) {
		List studentList =  new ArrayList();
		studentList.add(new Student(1,"sindhu","atp",96));
		studentList.add(new Student(2,"hari","xyz",98));
		studentList.add(new Student(3,"manu","pqr",96));
		studentList.add(new Student(4,"josh","kfk",95));
		for (Object ob : studentList) {
			Student studentList1 = (Student)ob;
			System.out.println(ob);
					}
			}
}
