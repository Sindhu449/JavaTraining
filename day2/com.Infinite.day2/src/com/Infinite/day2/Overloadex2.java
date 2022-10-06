package com.Infinite.day2;

public class Overloadex2 {

	public int sum(){
		return 5;
	}
	public int sum(int x){
		return x+5;
	}
	public int sum(int x,int y){
		return x+y;
	}
	public static void main(String[] args) {
		Overloadex2 obj = new Overloadex2();
		System.out.println("sum w.r.t. Zero args " +obj.sum());
		System.out.println("sum w.r.t. One arg  "+obj.sum(52));
		System.out.println("sum w.r.t. two arg " +obj.sum(42,23));
	}
}
