package com.infinite.cols;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {

	public static void main(String[] args) {
		Comparator c = new BasicComparator();
		//Comparator c = new NameComparator();
		SortedSet employList = new TreeSet(c);
		employList.add(new Employ(1,"Sindhu",87954));
		employList.add(new Employ(1,"sai",87954));
		employList.add(new Employ(1,"harui",87954));
		employList.add(new Employ(1,"harshini",87954));
		for (Object object : employList) {
			Employ employ = (Employ)object;
			System.out.println(employ);
			
		}
	
	}
}
