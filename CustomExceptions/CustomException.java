package com.java.CustomExceptions;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String str) {
		super(str);
	}
}
public class CustomException {

	static void validate(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("Age is not valid to vote");
		}
		else {
			System.out.println("Welcome to vote");
		}
	}
	public static void main(String[] args) {
		try {
			validate(13);
			
		} catch (InvalidAgeException iae) {
			System.out.println("Caught the Exception");
			System.out.println("Exception Occured: "+iae);
		}
		System.out.println("rest of code");
	}
}
