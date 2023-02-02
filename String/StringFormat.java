package com.java.String;

//String.format() method allows to concatenate multiple strings using format specifier like %s
public class StringFormat {
	public static void main(String[] args) {
		String s1 = new String("Hi");
		String s2 = new String(" Hello");
		String s3 = new String(" How r u ? ");
		String s = String.format( "%s%s%s", s1, s2, s3);
		System.out.println("The Format String is: " +s);
	}
	

}
