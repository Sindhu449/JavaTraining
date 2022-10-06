package com.Infinite.task;

public class RomanEx {

	public static void main(String[] args) {
		String str="91";
		int x=Integer.parseInt(str);
		String[] ones = {"I","II","III","IV","V","VI","VII","VIII","IX"};
		String[] tens = {"X","XX","XXX","XL","L","LX","LXX","LXXX","XC","C"};
		String result="";
		if (str.length()==2) {
			int num1 = str.charAt(0) - '0';
			result+=tens[num1-1];
			int num2 = str.charAt(1) - '0';
			if (num2!=0) {
				result+=ones[num2-1];	
			}
		}
		
		System.out.println(result);
	}
}
