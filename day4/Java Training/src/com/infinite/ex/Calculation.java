package com.infinite.ex;

import java.util.Scanner;

public class Calculation {

	public void calc(int a,int b) throws NegativeException, NumberZeroException{
		if(a<0||b<0){
			throw new NegativeException("negative nos not allowed...");
		}
		else if ( a==0||b==0){
			throw new NumberZeroException("Zero is Invalid value..");
		}
	}
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers  ");
		a = sc.nextInt();
		b = sc.nextInt();
		try {
			new Calculation().calc(a, b);
		}
		catch (NegativeException | NumberZeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
