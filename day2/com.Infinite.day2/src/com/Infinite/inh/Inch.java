package com.Infinite.inh;
class c1{
	c1(){
		System.out.println("c1 class constructor");
	}
}
class c2 extends c1{
	c2(){
		System.out.println("c2 class constructor");
	}
}
public class Inch {

	public static void main(String[] args) {
		new c2();
	}
}
