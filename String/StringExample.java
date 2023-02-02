package com.java.String;

public class StringExample {
	public static void main(String[] args) {
		String s1 = "java";//creating a String by String Literal
		char ch[]= {'S','t','r','i','n','g'};
		String str  = new String(ch ); // Converting char Array to String 
		String str1 = new String("Welcome");//creating a String by new keyword
		
		System.out.println("The String using String Literal: " +s1);
		System.out.println("Converting char Array to String: " +str);
		System.out.println("The String using new keyword: " +str1);
		
	}

}
