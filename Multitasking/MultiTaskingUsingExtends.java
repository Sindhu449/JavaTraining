package com.java.Multitasking;

public class MultiTaskingUsingExtends extends Thread{
	public void run() {
		System.out.println("Task one");
	}
	public static void main(String[] args) {
		MultiTaskingUsingExtends m1= new MultiTaskingUsingExtends();
		MultiTaskingUsingExtends m2 = new MultiTaskingUsingExtends();
		MultiTaskingUsingExtends m3 = new MultiTaskingUsingExtends();
		m1.start();
		m2.start();
		m3.start();
	}

}
