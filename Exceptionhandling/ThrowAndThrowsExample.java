package com.java.Exceptionhandling;

public class ThrowAndThrowsExample {

	static void method() throws ArithmeticException{
		System.out.println("Inside the Method()");
		throw new ArithmeticException("Throwing Arithmetic Exception");
		
	}
	public static void main(String[] args) {
		try {
			method();
			
		} catch (Exception e) {
			System.out.println("Caught in main() method");
			
		}
	}
}
