package com.java.Exceptionhandling;

public class MulticatchException {
	public static void main(String[] args) {
		
		try {
			int a[] = new int[10];
			a[5] = 30/0; // ArithmeticException
		} catch (ArithmeticException e) {
		 System.out.println("Arithmetic Exception Occurs");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index out Of Bound Exception occurs");
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Rest of code Executed........");
	}

}
