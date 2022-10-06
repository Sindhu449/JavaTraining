package com.infinite.day1;

public class CtoR {
	
	public void calc( double c){
		double r = (4*32)/5;
		System.out.println("radian value.." +c);
	}
	public static void main(String[] args) {
	double c =37;
	CtoR obj = new CtoR();
	obj.calc(c);
	}
	
}
