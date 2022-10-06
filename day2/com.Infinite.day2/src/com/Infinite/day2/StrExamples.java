package com.Infinite.day2;

public class StrExamples {
 
	public void show(){
		String str = "welcome to java programming";
		System.out.println("length of string is.."+ str.length());
		System.out.println("first occurance of char 'o' is "  +str.indexOf('o'));
		System.out.println("char at 5th position" +str.charAt(5));
		System.out.println("Lower case " +str.toLowerCase());
		System.out.println("Upper case" +str.toUpperCase());
		String s1="yeswanth",s2="mahendra",s3="yeswanth";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}
	public static void main(String[] args) {
		StrExamples obj = new StrExamples();
		obj.show();
	}
}
