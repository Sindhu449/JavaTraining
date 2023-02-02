package com.java.Exceptionhandling;

import java.io.IOException;

public class ThrowsUsingChecked {
	void a() throws IOException{
		throw new IOException("Device Error");
	}
	void b() throws IOException{
		a();
	}
	void c() {
		try {
		 b();
		} catch (Exception e) {
			System.out.println("exception Handled");
			
		}
	}
	public static void main(String[] args) {
		ThrowsUsingChecked obj = new ThrowsUsingChecked();
		obj.c();
		System.out.println("Normal Flow........");
	}

}
