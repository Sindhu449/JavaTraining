package com.infinite.ex;

public class EmployDemo {

	public static void main(String[] args) {
		Employ employ =  new Employ();
		employ.setEmpno(1);
		employ.setName("madhu");
		employ.setBasic(488124.24);
		System.out.println("Employ no  "+employ.getEmpno());
		System.out.println("Employ name  "+employ.getName());
		System.out.println("Employ basic  "+employ.getBasic());
	}
}
