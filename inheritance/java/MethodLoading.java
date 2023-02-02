package com.inheritance.java;


// Changing Number of Arguments
//class Adding{
//	static int add(int a, int b) {
//		return a+b;
//		
//	}
//	static int add(int a, int b, int c) {
//		return a+b+c;
//	}
//
//}
//public class MethodLoading {
//	public static void main(String[] args) {
//		Adding add = new Adding();
//	System.out.println(add.add(11, 120));
//		System.out.println(add.add(13, 14, 15));
//		
//	}
//}

//Changing Data type of Arguments

class Adding{
	static int add(int a, int b) {
		return a+b;
		
	}
	static double add(double a, double b) {
		return a+b;
		
	}
}
public class MethodLoading {
	public static void main(String[] args) {
		System.out.println(Adding.add(10.5, 55.6));
		System.out.println(Adding.add(15, 25));
	}

}