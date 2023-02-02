package com.java.Exceptionhandling;

import java.io.IOException;

class M {
	void method() throws IOException{
		throw new IOException("Device Error");
	}
}
public class ThrowsUsingTryCatch {

	public static void main(String[] args) {
		try {
			M m = new M();
			m.method();
		} catch (Exception e) {
			System.out.println("Exception Handled");
		}
		System.out.println("Normal flow");
	}
}
