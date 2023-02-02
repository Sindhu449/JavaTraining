package com.java.String;

public class ImmutableString {
	public static void main(String[] args) {
		String s = "Sindhu";
		//concat() method appends the string at the end
		s.concat("Hari");
		//will print Sachin because strings are immutable objects  
		System.out.println("The String is: "+s);
		
		
		// explicitly if we assign the s value to another String to Concate then it will print concatenated value
		
		s=s.concat(" Hari");
		System.out.println("The Concatenated String is: " + s);
	}

}
