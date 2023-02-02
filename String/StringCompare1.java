package com.java.String;

import java.util.Iterator;

public class StringCompare1 {
	public static void main(String[] args) {
		String s1 = "Sindhu";
		String s2 = " Hari";
		String s3 = new String("Sindhu");
		String s4 = "Sindhu";
		
		//To concatenate STring
		String c = s1.concat(s2);
		System.out.println("The Conacted STring is: "+c);
		
		//to uppercase case 
		String sl = "infinte solutions";
		String sl1 = sl.toUpperCase();
		System.out.println("The uppercase is: "+sl1);
		
		//to lowercase
		String su = "INFINITE SOLUTIONS";
		String su1 = su.toLowerCase();
		System.out.println("The Lowercase is: "+su1);
		
		//to find length of the string 
		System.out.println("The lenth is: " +s3.length());
		System.out.println("The length is: " +s4.length());
		
		//char at method
		char ch = s4.charAt(0);
		System.out.println("The character at: " +ch);
		
		//equals method
		System.out.println("The Equals value is: " +s1.equals(s2));//false
		System.out.println("The Equals value is: " +s1.equals(s3));//true
		System.out.println("The Equals value is: " +s1.equals(s4));//true
		
		// Example 2 using equalsIngnorecase
		//The equals() method returns true if String objects are
		//matching and both strings are of same case. equalsIgnoreCase()
		//returns true regardless of cases of strings.
		
		String s5 = "Hari";
		String s6 = "HARI";
		System.out.println("The Equals value is: " +s5.equals(s6));//false
		System.out.println("The EqualsIngnoreCase value is: " +s5.equalsIgnoreCase(s6));//true
	 
		//value of method
		
		double value = 11.50;
		String sv = String.valueOf(value);
		System.out.println("The ValueOf() is: "+sv);
	
		//Trim  to remove extra spaces
		
		String t = "    Programming       ";
		System.out.println(t + ": with java");
		System.out.println(t.trim() +" :with java");
		
		
	
	
	}

	
}
