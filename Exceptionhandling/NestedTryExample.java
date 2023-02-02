package com.java.Exceptionhandling;

public class NestedTryExample {
	public static void main(String[] args) {
		// outer try block
		try {
			//Inner try Block 1
			try {
				//Inner Try Block 2
				try {
					int arr[] = {1, 2, 3,4};
					
					System.out.println(arr[10]);
				} catch (ArithmeticException e) {
					System.out.println("Arithmetic Exception");
					System.out.println("Block2");
				}
				
			} catch (ArithmeticException e) {
				System.out.println("Arithmetic Exception");
				System.out.println("Block1");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bound Exception");
			System.out.println("Outer try block");
		}
		catch (Exception e) {
			System.out.println(e);
			System.out.println("Exception");
		}
	}

}
