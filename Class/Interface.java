package com.java.Class;


interface Drawable{
	void draw();
	
}
class Circle implements Drawable{
	 public void draw() {
		System.out.println("This is Circle");
	 }
 }

class Rs implements Drawable{
	public void draw() {
		System.out.println("This is Rectangle");
	}
}

public class Interface {
	public static void main(String[] args) {
		Drawable d = new Circle();
		Drawable r = new Rs();
		d.draw();
		r.draw();
		
	}

}
