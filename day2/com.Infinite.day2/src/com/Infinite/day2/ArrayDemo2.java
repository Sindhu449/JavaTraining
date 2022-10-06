package com.Infinite.day2;

public class ArrayDemo2 {

	public void show(){
		String[] names = new String[]{
				"sachin","sireesha","vaibhav","vaishnavi","sowmya","sravani"
						};
		for(String s : names){
			System.out.println(s);
		}
}
	public static void main(String[] args) {
		ArrayDemo2 obj = new ArrayDemo2();
		obj.show();
	}
}
