package com.java.Exceptionhandling;

import java.io.IOException;

   //If exception does not occur
//class M1{
//	void method() throws IOException {
//		System.out.println("Opertion performed");
//	}
//}
//
//public class ThrowsDeclareException {
//	public static void main(String[] args) throws IOException {
//		M1 m = new M1();
//		m.method();
//		System.out.println(" Normal Flow");
//	}
//
//}

    //if Exception Occur

class M1{
	void method() throws IOException{
		throw new IOException("Device Error");
	}
}
public class ThrowsDeclareException {
	public static void main(String[] args) throws IOException {
		M1 m = new M1();
		m.method();
		System.out.println("Normal Flow");
	}
}
