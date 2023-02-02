package com.java.MultiThreading;

public class GroupThread implements Runnable{

	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		GroupThread run = new GroupThread();
		ThreadGroup tg = new ThreadGroup("Thread Parent Group");
		
		Thread t1 = new Thread(tg, run, "one");
		t1.start();
		Thread t2 = new Thread(tg, run, "Two");
		t2.start();
		Thread t3 = new Thread(tg, run, "Three");
		t3.start();
		System.out.println("Thread Group Name : " +tg.getName());
		tg.list();
		
	}
}

