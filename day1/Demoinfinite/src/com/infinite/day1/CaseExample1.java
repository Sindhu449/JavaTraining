package com.infinite.day1;

public class CaseExample1 {

	public void show(int n){
		switch(n){
		case 1:
			System.out.println("hi in am sindhu");
			break;
		case 2:
			System.out.println("hi i am hari");
			break;
		case 3:
			System.out.println("hi i am josh");
			break;
		case 4:
			System.out.println("hi i am manu");
			break;
		case 5:
			System.out.println("hi i am nothing ");
			break;
		default :
			System.out.println("Invalid Choice...");
		}
	}
	public static void main(String[] args) {
		int n = 2;
		CaseExample1 obj = new CaseExample1();
		obj.show(n);
		
	}
	
}
