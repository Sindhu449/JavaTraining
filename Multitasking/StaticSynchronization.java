package com.java.Multitasking;

class Table3 {
	  synchronized static void printTable(int n) {
			for(int i =1; i<=10;i++) {
				System.out.println(n*i);
				try {
					Thread.sleep(300);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}
		
		class Thread3 extends Thread{
			 public void run() {
				 Table3.printTable(3);
			 }
		}
		class Thread4 extends Thread{
			 public void run() {
				 Table3.printTable(30);
			 }
		}
		class Thread5 extends Thread{
			 public void run() {
				 Table3.printTable(200);
			 }
		}
		class Thread6 extends Thread{
			 public void run() {
				 Table3.printTable(500);
			 }
		}
		
public class StaticSynchronization {
	public static void main(String[] args) {
		Thread3 t3 = new Thread3();
		Thread4 t4 = new Thread4();
		Thread5 t5 = new Thread5();
		Thread6 t6 = new Thread6();
	
		t3.start();
		t4.start();
		t5.start();
		t6.start();
	}

}
