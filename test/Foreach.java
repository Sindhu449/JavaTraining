package com.java.test;

public class Foreach {
	//data structures like array or collection.

	public static void main(String[] args) {
//		int arr[]= {12,13,14,44};// declaring the array
//		for (int i : arr) { // travesring array with for each loop
//			System.out.println(i);
//			
		String[] names= {"java","c","c++","python"};
		System.out.println("Printing the content of array names:/n");
		for (String name : names) {
			System.out.println(name);
		}
		}
		
	}
