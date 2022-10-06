package com.infinite.day1;

public class Sub5 {

	public void check(int a, int b, int c, int d,int e){
		double total = a+b+c+d+e;
		double average = total/5;
		System.out.println("print total marks.." + total);
		System.out.println("print average.."+ average);
		if(total>=35){
			System.out.println("pass " +total);
		}else{
			System.out.println("fail");
		}
	}
	public static void main(String[] args) {
		int a,b,c,d,e;
		a=98;
		b=88;
		c=80;
		d=78;
		e=93;
		Sub5 obj = new Sub5();
		obj.check(a,b,c,d,e);
	}
}
