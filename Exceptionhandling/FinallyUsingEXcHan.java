package com.java.Exceptionhandling;

//Finally block is always related to the try and catch block in exception handling.
//finally block runs the important code even if exception occurs or not.
public class FinallyUsingEXcHan {
	public static void main(String[] args) {
		try {
			System.out.println("Inside try block");
			int data = 20/0;
			System.out.println(data);
		} catch (ArithmeticException e) {
			System.out.println("Exception Handled");
			System.out.println(e);
		}
		finally {
			System.out.println("Final Block is Excecuted");
		}
		System.out.println("Rest of code");
	}

}
