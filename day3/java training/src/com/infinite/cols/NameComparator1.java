package com.infinite.cols;

import java.util.Comparator;

public class NameComparator1 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		
		
		// TODO Auto-generated method stub
		return s2.name.compareTo(s1.name);
	}
	

	
}
