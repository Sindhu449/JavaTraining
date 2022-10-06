package com.Infinite.sup;

class First{
	public void show(){
		System.out.println("show method from first class");
	}
}
class Second extends First{
	public void show(){
		super.show();
		System.out.println("show method from second class");
	}
}
public class Supex {
	public static void main(String[] args) {
		Second obj = new Second();
		obj.show();
	}

}
