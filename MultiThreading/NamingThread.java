package com.java.MultiThreading;

public class NamingThread extends Thread{

	public void run() {
		System.out.println("Runnig");
	}
	public static void main(String[] args) {
		NamingThread t1 = new NamingThread();
		NamingThread t2 = new NamingThread();
		System.out.println("NAme of t1:" +t1.getName());
		System.out.println("Name of t2:" +t2.getName());
		
		t1.start();
		t2.start();
		
		t1.setName("Sindhu");
		System.out.println("After Changing name t1: "+t1);
	}
}
