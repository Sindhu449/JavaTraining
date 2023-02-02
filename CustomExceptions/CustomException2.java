package com.java.CustomExceptions;

class MyCustomException extends Exception{
	// no exception is raised
}
public class CustomException2 {

	public static void main(String[] args) {
		try {
			throw new MyCustomException();
		} catch (MyCustomException ce) {
			System.out.println("caught custom Exception");
			System.out.println(ce.getMessage());
		}
		System.out.println("rest of code");
	}
}
