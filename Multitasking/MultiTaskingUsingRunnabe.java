package com.java.Multitasking;

public class MultiTaskingUsingRunnabe implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Task one");
	}
	public static void main(String[] args) {
		Thread t1 = new Thread(new MultiTaskingUsingRunnabe());
		Thread t2 = new Thread(new MultiTaskingUsingRunnabe());
		t1.start();
		t2.start();
		//System.gc();
	}

}
