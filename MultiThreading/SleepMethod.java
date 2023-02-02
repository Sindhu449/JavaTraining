package com.java.MultiThreading;


public class SleepMethod extends Thread{

	public void run() {
		for(int i = 1; i<5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException ie) {
				System.out.println(ie);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		SleepMethod s1 = new SleepMethod();
		SleepMethod s2 = new SleepMethod();
		s1.start();
		s2.start();
	}
}
