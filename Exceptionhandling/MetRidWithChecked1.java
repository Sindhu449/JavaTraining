package com.java.Exceptionhandling;

import java.io.IOException;

//If the superclass method does not declare an exception
//If the superclass method does not declare an exception,
//subclass overridden method cannot declare the checked exception but it can declare unchecked exception.
class Parent1{
	void msg() {
		System.out.println("Parent Method");
	}
}

public class MetRidWithChecked1 extends Parent1{

	// we get error because we cannot create checked exceptions if 
	// parent is not having the same exception
//	void msg() throws IOException{
//		System.out.println("Exception Child");
//	}
//	public static void main(String[] args) {
//
//		Parent1 p = new MetRidWithChecked1();
//		p.msg();
//}
//	
//
  }
