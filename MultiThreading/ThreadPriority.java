package com.java.MultiThreading;

public class ThreadPriority extends Thread{
	public void run() {
		System.out.println("Inside the Run Method ");
	}
	public static void main(String[] args) {
		ThreadPriority t1 = new ThreadPriority();
		ThreadPriority t2 = new ThreadPriority();
		ThreadPriority t3 = new ThreadPriority();
		
		System.out.println("The Default Priority of t1 is: "+t1.getPriority());
		System.out.println("The Default Priority of t2 is: "+t2.getPriority());
		System.out.println("The Default Priority of t3 is: "+t3.getPriority());
		
		t1.setPriority(4);
		t2.setPriority(9);
		t3.setPriority(1);
		
		System.out.println("The Explicit decalred Priority of t1 is: "+t1.getPriority());
		System.out.println("The Explicit decalred Priority of t2 is: "+t2.getPriority());
		System.out.println("The Explicit decalred Priority of t3 is: "+t3.getPriority());
		
		System.out.println("Currently Executing The Thread : " + Thread.currentThread().getName());  
		System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority()); 
		Thread.currentThread().setPriority(8);
		System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority()); 
	}

}
