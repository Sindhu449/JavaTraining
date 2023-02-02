package com.java.MultiThreading;

public class DaemonThread extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon thread work");
		}else {
			System.out.println("User Thread work");
		}
	}
	public static void main(String[] args) {
		DaemonThread t1 = new DaemonThread();
		DaemonThread t2 = new DaemonThread();
		DaemonThread t3 = new DaemonThread();
		
		// if we place daemon thread after a thread is started by user then we will get iilegal exception
		//before start method it will set the thread as daemon thread
		t1.start();
		t1.setDaemon(true);
		
		t2.start();
		t3.start();
	}

}
