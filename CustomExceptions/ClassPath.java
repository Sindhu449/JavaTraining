package com.java.CustomExceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ClassPath {
	
	public static String method() throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		FileReader file  = new FileReader(s);
		BufferedReader fileInput = new BufferedReader(file);
		
		throw new FileNotFoundException();
		}
		
	    public static void main(String[] args) {
		try {
			method();
			System.out.println("Failure");
		} catch (FileNotFoundException fe) {
			//System.out.println(fe);
			System.out.println("Success");
			
		}
		System.out.println("Rest of code");
	  }

//"D:\\Java training\\day70\\Test\\src\\com\\java\\Exceptionhandling\\FinalBlock.java"
}
