package com.Infinite.day2;

public class Boxingex1 {

	public void show(Object ob){
		String type = ob.getClass().getSimpleName();
		System.out.println(type);
		if(type.equals("Integer")){
			System.out.println("Integer casting..");
			int x= (Integer)ob;
		}
		if(type.equals("Double")){
			System.out.println("Double casting....");
			double x = (Double)ob;
		}
		if(type.equals("String")){
			System.out.println("String casting");
			String x=(String)ob;
		}
	}
	public static void main(String[] args) {
		int a=12;
		String str="Hello";
		double bas=84823.44;
		Boxingex1 obj = new Boxingex1();
		obj.show(a);
		obj.show(str);
		obj.show(bas);
		
		
	}
}
