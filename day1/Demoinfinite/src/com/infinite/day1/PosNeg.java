package com.infinite.day1;

public class PosNeg {

	public void check(int n){
		if(n >=0){
			System.out.println("Positive number....");
		}else{
			System.out.println("Neagtive number....");
		}
	}
	public static void main(String[] args) {
        int n=5;
        PosNeg obj = new PosNeg();
        obj.check(n);
	}
}
