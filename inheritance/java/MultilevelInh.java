package com.inheritance.java;

class Animal{
	void animalDetails() {
		System.out.println(" Animal details...");
	}
}
class Dog extends Animal{
	void feature() {
		System.out.println("This is Dog");
	}
}
class Cat extends Dog{
	void behaviour() {
		System.out.println("It Sounds MEOWWWW");
	}
}
public class MultilevelInh {

	public static void main(String[] args) {
		Cat c = new Cat();
	   
				c.animalDetails();
				c.feature();
				c.behaviour();
				
	}
}
