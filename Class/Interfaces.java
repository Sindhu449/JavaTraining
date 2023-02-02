package com.java.Class;


interface A1{
	void display();
}
class A2 implements A1{
	 public void display() {
		System.out.println("This is Class");
	}
}
public class Interfaces {
	
public static void main(String[] args) {
	A1 a = new A2();
	a.display();
}
}
