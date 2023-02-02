package com.java.String;


//s1 == s2 : The method returns 0.
//s1 > s2 : The method returns a positive value.
//s1 < s2 : The method returns a negative value.
public class StringCompareto {

	public static void main(String[] args) {
		String s1="Sachin";
		String s2="sachinaa";
		String s3= "Ratan";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s1));
		
//		Integer a = 10;
//		Integer b = 0;
//		Integer c = 25;
//		
//		System.out.println(a.compareTo(b));
//		System.out.println(a.compareTo(c));
//		System.out.println(a.compareTo(a));
	}
}
