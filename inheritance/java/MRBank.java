package com.inheritance.java;


class Bank{
	double getRateOfIntrest() {
		return 0;
		
	}
}
	class Sbi extends Bank{
		double getRateOfIntrest() {
			return 10.5;
			
		}
	}
	class Icici extends Bank{
		double getRateOfIntrest() {
			return 12.6;
		}
	}
	class Hdfc extends Bank{
		double getRateOfIntrest() {
			return 0;
			
		}
	}
public class MRBank {
	
	public static void main(String[] args) {
		Hdfc h = new Hdfc();
		Sbi s = new Sbi();
		Icici i = new Icici();
		System.out.println("Get rate of Intrest: "+h.getRateOfIntrest());
		System.out.println("Get rate of Intrest: "+s.getRateOfIntrest());
		System.out.println("Get rate of Intrest: "+i.getRateOfIntrest());
	}

}
