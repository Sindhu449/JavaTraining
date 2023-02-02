package com.inheritance.java;

class Person{
	float salary=40000;
}

 class Programmer extends Person{
	 int bonus=10000;

 }
 
 	public class Employe {
	 public static void main(String[] args) {
	 		
	 		Programmer p = new Programmer();
	 		Person e = new Person();
	 		System.out.println(" Programmer salary is:  "+e.salary);
	 		System.out.println(" Bonus is:  "+p.bonus );
	 	}

	 }
 	
 
	
