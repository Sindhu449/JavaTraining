package com.Infinite.day2;

public class Conex {

	static {
		System.out.println("static constructor...");
	}
	Conex(){
		System.out.println("Instance Constructor...");
	}
	public static void main(String[] args) {
		new Conex();
	}
}
