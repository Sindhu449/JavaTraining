package com.java.String;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class HighOccuranceCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
//		String str = "good morninggg";
	
		char maxArray[] = str.toCharArray();
		Arrays.sort(maxArray);
		String s = new String(maxArray);
		int n = s.length();
		int max_count = 0;
		int count = 1;
		char ans = '-';
		for(int i=1; i<=n; i++){
			if((i==n) || (str.charAt(i) != s.charAt( i-1))) {
				if(max_count < count) {
					max_count = count;
					ans = s.charAt(i-1);
				}
				count = 1;
			}
			else {
				count++;
			}
		}

		System.out.println("Maximum Occuring Character is "+ans);
	}

}
