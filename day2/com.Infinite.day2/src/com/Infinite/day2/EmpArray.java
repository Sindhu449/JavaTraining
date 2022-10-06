package com.Infinite.day2;

public class EmpArray {

	public static void main(String[] args) {
		Emp[] arr = new Emp[]{
				new Emp(1,"Sai Kamala",25863),
				new Emp(2,"Sindhu",58964),
				new Emp(3,"Hari",65864),
				new Emp(4,"hk",65896)
		};
		
		for(Emp emp : arr){
			System.out.println(emp);
		}
	}
}
