package com.java.Exceptionhandling;

public class ThrowsExample {
	public static int divideNum(int m, int n) throws ArithmeticException{
		int div = m/n;
		return div;
		
	}
	public static void main(String[] args) {
		ThrowsExample t1 = new ThrowsExample();
		try {
			System.out.println(t1.divideNum(56, 0));
			
		} catch (ArithmeticException ae) {
			System.out.println("\n Number Cannot be Divivdes by 0");
			
		}
		System.out.println("Rest of code");
	}

}
