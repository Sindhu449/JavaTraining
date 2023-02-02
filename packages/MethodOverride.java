package com.poly.java;
class Animal {
	  public void animalSound() {
	    System.out.println("The animal makes a sound");
	  }
	}

	class Pig extends Animal {
	  public void animalSound() {
	    System.out.println("The pig says: wee wee");
	  }
	}

	class Dog extends Pig {
	  public void animalSound() {
	    System.out.println("The dog says: bow wow");
	  }
	}

public class MethodOverride {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.animalSound();
		Dog d = new Dog();
		d.animalSound();
//		Pig p = new Pig();
//		p.animalSound();
		
		
	}

}
