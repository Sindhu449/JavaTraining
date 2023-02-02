package com.java.p2;

import com.java.packages.StaticImport;

//Private Example
//public class A {
//	
//	// privtae is accessible only with in the class
//	private void display() {
//	
//		System.out.println(" This is private");
//	}
//}
//class B extends A{
//	
//	public static void main(String[] args) {
//	
//		A obj = new A();
//		//Trying to access private methos of another class which cant be accessible
////		obj.display(); //display has privtae method in A
//	 
//	}
//}

// Protected class
public class A{
	public void display() {
		System.out.println("This is Protected");
	}
	
}