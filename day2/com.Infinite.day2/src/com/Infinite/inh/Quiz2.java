package com.Infinite.inh;

public class Quiz2 {

	int x;
	public static void show(){
		//System.out.println("x value is" +x);//x is non static variable soo compile time error
	}
	//static boolean climate;
	public static void main(String[] args) {
		//System.out.println(climate);
		//System.out.println(i);// initialization not done so compile error
		show();
	}
}
