package com.Infinite.task;

public class InttoRoman {
	public static void InttoRoman(int num){
		
		System.out.println("Integer:" +num);
		int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};  
		StringBuilder roman = new StringBuilder(); 
		//for(int i=0;i<values.length;i++){
		for (String string : romanLetters) {
			
			int s = 0;
			while(num >= values[s]) {
				num = num - values[s]; 
				roman.append(romanLetters[s]);  
			}
		}
			System.out.println("Corresponding Roman Numerals is: " + roman.toString());  

		  }
	public static void main(String[] args) {
		InttoRoman(12);
		InttoRoman(22);
		InttoRoman(10);  
		InttoRoman(1111);  
	}
	}

