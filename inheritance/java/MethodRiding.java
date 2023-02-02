package com.inheritance.java;
//The name and parameter of the method are the same
class Vehicle{
	void run() {
		System.out.println("This is vehicle");
	}
}
class Bike extends Vehicle{
	void run() {
		System.out.println("This is Bike");
		
	}
}
public class MethodRiding {
	public static void main(String[] args) {
		

	Bike b = new Bike();
	b.run();
	}

}
