package com.java.MultiThreading;

class Join1 extends Thread{
	Thread threadInterrupt;
	public void run() {
		threadInterrupt.interrupt();
	}
}
public class JoinMethod{
	public static void main(String[] args) {
		try {
			Join1 j1 = new Join1();
			j1.threadInterrupt = Thread.currentThread();
			j1.start();
			// invoking the join() method leads   
			// to the generation of InterruptedException  
			j1.join();
		} catch (InterruptedException e) {
			System.out.println("The Exception has been caught " + e);
		}
	}
}