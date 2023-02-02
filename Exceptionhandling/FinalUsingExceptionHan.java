package com.java.Exceptionhandling;

//Final keyword is used with the classes, methods and variables.
//(1) Once declared, final variable becomes constant and cannot be modified.
//(2) final method cannot be overridden by sub class.
//(3) final class cannot be inherited.	
// (4)	Execution	Final method is executed only when we call it.
public class FinalUsingExceptionHan {
	final int age = 18; // final variable declared
	void display() {
		// Reassigning final variable
		//compile time error will come
		//age=55;
	}
	public static void main(String[] args) {
		FinalUsingExceptionHan f = new FinalUsingExceptionHan();
		f.display();
		
	}

}
