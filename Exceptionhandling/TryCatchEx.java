package com.java.Exceptionhandling;

public class TryCatchEx {
	public static void main(String[] args) {
		try {
			int i = 100/0; // Arithmetic Exception
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("The Arithmetic Exception");
		
//		try {
//			String s = null; // NullPointer Exception
//		} catch (NullPointerException e) {
//			System.out.println(e);
//		}
//		System.out.println("The Null Pointer Exception");
//		
//		
//		try { 
//			String s1 = "abc";
//			int i = Integer.parseInt(s1); // NumberFormat Exception
//		} catch (NumberFormatException e) {
//			System.out.println(e);
//		}
//		
//		System.out.println("Number format Exception");
//		
//		try {
//			int a[] = new int[5];
//			a[10] = 50;
//		} catch (ArrayIndexOutOfBoundsException e) {
//			// TODO: handle exception
//			System.out.println(e);
//		}
//		System.out.println("The Array Index Out Of Bounds Exception ");
//		
		
	}

}
