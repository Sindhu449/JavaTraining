package com.java.StringBuffer;

//StringBuffer Capacity method, actually capacity is 16 and after assigning any values it will calculate as (16*2)+2

public class StringBufferCapacity {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println("The Default capacity is: " +sb.capacity());//16
		sb.append("Sindhu");
		System.out.println(sb.capacity());//16
		sb.append("java programming language");  
		System.out.println(sb.capacity());//now (16*2)+2=34 
		sb.append(" java is a pur object oriented language");
		System.out.println(sb.capacity());// now 70 (34*2)+=70
		
		
	}

}
