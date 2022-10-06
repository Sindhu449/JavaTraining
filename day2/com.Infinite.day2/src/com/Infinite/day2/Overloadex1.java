package com.Infinite.day2;

public class Overloadex1 {

	public void show(int x){
		System.out.println("show method w.r.t. Integer" +x);
	}
	public void show(double x){
		System.out.println("show method w.r.t. Double" +x);
	}
	public void show(String x){
		System.out.println("show method w.r.t. String" +x);
	}
	public static void main(String[] args) {
		Overloadex1 obj = new Overloadex1();
		obj.show(12);
		obj.show(12.5);
		obj.show("welcome");
		
	}
}
