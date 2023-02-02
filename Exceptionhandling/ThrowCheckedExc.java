package com.java.Exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowCheckedExc {
	
	public static void method() throws FileNotFoundException {
	FileReader file  = new FileReader("D:\\Java training\\day70\\Test\\src\\com\\java\\Exceptionhandling\\FinalBlock.java");
	BufferedReader fileInput = new BufferedReader(file);
	
	throw new FileNotFoundException();
	}
	
    public static void main(String[] args) {
	try {
		method();
	} catch (FileNotFoundException fe) {
	
		fe.printStackTrace();
		
	}
	System.out.println("Rest of code");
  }


}
