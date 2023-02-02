package com.java.String;

import java.util.Scanner;

public class MaxOccurChar {
	
	  public static void main(String[] args) {
	      Scanner in = new Scanner(System. in);
	      String s = in.nextLine();
	      
	      // here we are creating array of size 256
	        int[] value = new int[256];
	        int n = s.length();
	        for (int i = 0; i < n; i++)
	        {
	            value[s.charAt(i)]++;
	        }
	        int max_count = 0;
	        char ans=' ';
	        for (int i = 0; i < 100; i++)
	        {
	            if (value[i] > max_count)
	            {
	                max_count = value[i];
	                ans = (char)i;
	            }
	        }
	    System.out.println("Maximum occurring character is "+ans);
	  }
	}

