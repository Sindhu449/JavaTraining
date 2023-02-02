package com.java.test;

public class Dowhile {

	public static void main(String[] args) {
		int i=0;
		System.out.println("printing first 10 even numbers");
		do {
			System.out.println(i);
			i = i+2;
		}
		while(i<=10);
	}
}
