package com.java.MultiThreading;

public class RunMethod implements Runnable{

	@Override
	public void run() {
		for(int i =1; i<5;i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		RunMethod t1 = new RunMethod();
		RunMethod t2 = new RunMethod();
		//doesn't create a new thread but it runs
		t1.run();
		t2.run();
	}

}
