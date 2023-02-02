package com.java.Exceptionhandling;

public class ThrowExample {
	public static void CheckNum(int n) {
		if(n<1) {
			throw new ArithmeticException("\n NUmber is Negative, Cannot Calculatr");
		}
		else {
			System.out.println("Square of " + n + " is " + (n*n));
		}
	}

	public static void main(String[] args) {
		ThrowExample t = new ThrowExample();
		//t.CheckNum(-2);
		t.CheckNum(2);
		System.out.println(" Rest of Code");
	}
}
