package com.infinite.day1;

public class OddShow {

	public void show(int n){
		int i=1;
		while(i<n){
			i=i+2;
			System.out.println("odd "+i);
		}
	}
	public static void main(String[] args) {
		int n=20;
		OddShow obj = new OddShow();
		obj.show(n);
	}
}
