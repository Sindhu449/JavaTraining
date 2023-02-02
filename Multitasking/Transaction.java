package com.java.Multitasking;

class Customer{
	int amount = 10000;
	public synchronized void withdraw(int amount) {
		System.out.println("Going To Withdraw");
		if(this.amount<amount) {
			System.out.println("Less Balance; deposit amount");
			try {
				wait();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		this.amount-=amount;
		System.out.println("Withdraw Complete");
		System.out.println(amount);
	}
	synchronized void deposit(int amount) {
		System.out.println("Going to Deposit");
		this.amount+=amount;
		System.out.println("Deposit complete");
		System.out.println(amount);
		notify();
	}
}
public class Transaction {

	public static void main(String[] args) {
		final Customer c = new Customer();
		new Thread() {
		public void run() {
			c.withdraw(20000);
		}
		}.start();

		
		new Thread() {
		public void run() {
			c.deposit(12000);
		}
	}.start();
}
}
