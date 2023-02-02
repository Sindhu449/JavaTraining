package com.java.MultiThreading;

//Using the Thread Class: Thread(String Name)
public class ThreadConstructor {
	public static void main(String[] args) {
		Thread t = new Thread("My First Thread");
		t.start();
		String str = t.getName();
		System.out.println(str);
	}

}
