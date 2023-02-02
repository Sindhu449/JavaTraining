package com.java.CustomExceptions;


public class ArrayException1 {
	public static void main(String[] args) {
		int[] numbers = new int[]{1, 2, 6, 4, 5};
		int result = multiplyNumbers(numbers);
		System.out.println("Result: " + result);
		}
	public static int multiplyNumbers(int[] numbers) {
		try {
			int result = 1;
			for (int i = 0; i < numbers.length; i++) {
				result *= numbers[i];
			}
			return result;
		} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Failure: Array index out of bounds");
				return -1;
		} catch (NullPointerException e) {
					System.out.println("There is no input");
		} finally {
			System.out.println("Finally block executed");
		}
		return -1;
		}
}