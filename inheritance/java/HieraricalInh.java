package com.inheritance.java;

class Animal1{
	void animalDetails() {
		System.out.println(" Animal details...");
	}
	
}
class Dog1 extends Animal1{
	void feature() {
		System.out.println("This is Dog");
	}
}
class Cat1 extends Animal1{
	void behaviour() {
		System.out.println("It Sounds MEOWWWW");
	}
}

public class HieraricalInh {

	public static void main(String[] args) {
		Cat1 c = new Cat1();
		Dog1 d = new Dog1();
				c.animalDetails();
		d.animalDetails();
		d.feature();
				c.behaviour();
				
	}
}
