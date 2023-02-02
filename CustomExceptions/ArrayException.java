package com.java.CustomExceptions;

import java.util.Scanner;

public class ArrayException {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numbers = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			if (scan.hasNextLine()) {
				String line = scan.nextLine();
			  if(line.isEmpty()) {
				  System.out.println("No input");
				  break;
			  }else {
				  try {
					numbers[i]= Integer.parseInt(line);
				} catch (NumberFormatException ne) {
					System.out.println("Invalid Input");
					break;
				}
			  }
			}
			}
	int result = multiplyNumbers(numbers);
	System.out.println("Result: " + result);
	}
	public static int multiplyNumbers(int[] numbers) {
		try {
			int result = 1;
			for(int i = 0; i<numbers.length; i++) {
				result *= numbers[i];
			}
			return result;
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("Failure: Array Index Out of Bound Exception");
			return -1;
		} catch (NullPointerException npe) {
			System.out.println("There is no input");
		} finally {
			System.out.println("Finally Block is executed");
		}
		return -1;
	}
}
