package com.java.String;

import java.util.StringJoiner;
//String join method is done using the StringJoiner class
public class StringJoin {
	public static void main(String[] args) {
		
		//creating Object for StringJoiner
		StringJoiner s = new StringJoiner(", ");
		s.add("Hari krishna");
		s.add("Sindhu");
		s.add("Jyoshna");
		System.out.println(s.toString());
	}

}
