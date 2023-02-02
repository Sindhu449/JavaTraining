package com.java.String;

//Conactation using Stringbuilder it provides append() tp perform conact used for Objects, 
//StringBuilder, int, char, CharSequence, boolean, float, double.
public class StringBuilderConcat {
	
	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder(" hi");
		StringBuilder stringBuilder1 = new StringBuilder(" hello");
		StringBuilder stringBuilder2 = stringBuilder.append(stringBuilder1);
		System.out.println(stringBuilder.toString());
		
		
	}

}
