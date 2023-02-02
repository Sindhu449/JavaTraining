package com.java.Multitasking;

class Table2 {
	  void printTable(int n) {
		  synchronized(this) {
			for(int i =1; i<=5;i++) {
				System.out.println(n*i);
				try {
					Thread.sleep(300);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}
		
		class Thread1 extends Thread{
			Table1 t ;
			 Thread1(Table1 t) {
				this.t= t;
			}
			 public void run() {
				 t.printTable(8);
			 }
		}
		class Thread2 extends Thread{
			Table1 t ;
			 Thread2(Table1 t) {
				 this.t = t;
			}
			 public void run() {
				 t.printTable(9);
			 }
		}
}
public class SynchronizedBlock {
	public static void main(String[] args) {
		Table1 obj = new Table1();
		Thread1 t1 = new Thread1(obj);
		Thread2 t2 = new Thread2(obj);
		t1.start();
		t2.start();
		
		
	}

}
