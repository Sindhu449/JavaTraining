package com.java.String;

public class StringComapre2 {
	public static void main(String[] args) {
		String s1="Sindhu";
		String s2="Sindhu";
		String s3 = new String("Sindhu");
		
//		s1 = "Hari";
//		System.out.println(s1);
		
		System.out.println(s1==s2);
		//true (because both refer to same instance)  
		System.out.println(s1==s3);
		//false(because s3 refers to instance created in nonpool)
		
		
		String sa = "ATP";
		String sa1 = "BNG";
		sa = sa1;
		System.out.println(sa);
	}

}
