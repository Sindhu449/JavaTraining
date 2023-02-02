package com.java.test;

public class Foreach1 {
	public static void main(String[] args) {
		int arr[]= {12,13,14,44};
		int total=20;
		for (int i : arr) {
			total=total+i;
		}
		System.out.println("Total: " +total);
	}

}
