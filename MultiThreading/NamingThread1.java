package com.java.MultiThreading;

class ThreadName extends Thread{
	public ThreadName(String threadName) {
		super(threadName);
	}
	public void run() {
		System.out.println("The thrtead is executing...");
	}
}
public class NamingThread1 {

	public static void main(String[] args) {
		ThreadName t1 = new ThreadName("Sindhu");
		ThreadName t2 = new ThreadName("Alatharappa");
		System.out.println("Thread-1: " +t1.getName());
		System.out.println("Thread-2: " +t2.getName());
		t1.start();
		t2.start();
	}
	
}
