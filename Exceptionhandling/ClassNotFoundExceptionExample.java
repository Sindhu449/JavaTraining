package com.java.Exceptionhandling;

public class ClassNotFoundExceptionExample {
	
	public static void main(String[] args) {
		try {
			Class.forName("D:\\Java training\\day70\\Test\\src\\com\\java\\Exceptionhandling\\FinalBlock.java");

            ClassLoader.getSystemClassLoader().loadClass("D:\\Java training\\day70\\Test\\src\\com\\java\\Exceptionhandling\\FinalBlock.java");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
