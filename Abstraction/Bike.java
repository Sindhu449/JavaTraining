package com.java.Abstraction;

abstract class Vehicle{
	abstract void run();
}
 class Honda extends Vehicle{
	 void run() {
		System.out.println("This is bike");
	}
}
public class Bike {
	public static void main(String[] args) {
		Honda h = new Honda();
		h.run();
		
	}

}
