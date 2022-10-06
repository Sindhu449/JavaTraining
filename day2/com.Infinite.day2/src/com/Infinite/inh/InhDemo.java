package com.Infinite.inh;

class First {
	
	public void show(){
		System.out.println("show method from class first...");
	}
}
class Second extends First {
	public void display(){
		System.out.println("Display method from class clas Second..");
	}
	}
public class InhDemo {

	public static void main(String[] args) {
		Second obj = new Second();
		obj.show();
		obj.display();
	}
	}