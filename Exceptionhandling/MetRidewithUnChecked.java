package com.java.Exceptionhandling;

class Parent{
	void msg() {
		System.out.println("Parent Method");
	}
}
public class MetRidewithUnChecked extends Parent{

	void msg() throws ArithmeticException {
		System.out.println("child method");
		
	}
	public static void main(String[] args) {
		Parent p = new MetRidewithUnChecked();
		p.msg();
	}
}
