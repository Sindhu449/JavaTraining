package com.java.MultiThreading;

//Thread class extends Object class and implements Runnable interface.
public class ExtendThread extends Thread  {

	public void run() {
		System.out.println("Thread is Running");
	}
	public static void main(String[] args) {
		ExtendThread e = new ExtendThread();
		e.start();
	}
	
}
