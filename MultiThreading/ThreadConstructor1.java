package com.java.MultiThreading;

//Using the Thread Class: Thread(Runnable r, String name)
public class ThreadConstructor1 implements Runnable{

	@Override
	public void run() {
		System.out.println("This is using constructor Thread(Runnable r, String name) ");
		
	}
	
	public static void main(String[] args) {
		Runnable r = new ThreadConstructor1();
		Thread th1 = new Thread(r, "My new Thread");
		th1.start();
		String str = th1.getName();
		System.out.println(str);
	}

}
