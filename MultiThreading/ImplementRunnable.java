package com.java.MultiThreading;

public class ImplementRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println(" Thread is Running");
	}
	public static void main(String[] args) {
		ImplementRunnable r = new ImplementRunnable();
		Thread t1 = new Thread(r);
		t1.start();
	}
	

}
