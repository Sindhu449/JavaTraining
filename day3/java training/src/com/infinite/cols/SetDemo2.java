package com.infinite.cols;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo2 {
 public static void main(String[] args) {
	Set names = new LinkedHashSet();
			names.add("bhargavi");
			names.add("harsha");
			names.add("seeenu");
			names.add("bhargavi");
			names.add("seenu");
			names.add("harsha");
			names.add("akhila");
			names.add("sai");
			names.add("harshini");
			names.add("naveen");
			names.add("vardhil");
			for (Object ob : names) {
				System.out.println(ob);
				
			}
		}

}
