package com.infinite.cols;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		SortedSet names = new TreeSet();
		names.add("bhargavi");
		names.add("jjaved");
		names.add("akhila");
		names.add("vardhil");
		names.add("naveen");
		for (Object ob : names) {
			System.out.println(ob);
			
		}
	}
}
