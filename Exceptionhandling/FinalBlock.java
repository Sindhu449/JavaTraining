package com.java.Exceptionhandling;

public class FinalBlock {
	public static void main(String[] args) {
		try {
			int data = 25/5;
			System.out.println(data);
		} 
		//here is catch block is not executed because the exception is not occured in try block
		catch (NullPointerException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("The Finally Block is Excecuted");
		}
	}

}
