package com.java.Exceptionhandling;

//finalize() method is used with the objects.
//finalize method is executed just before the object is destroyed.
public class FinalizeUsingExcHan {
	
	public static void main(String[] args) {
		FinalizeUsingExcHan obj = new FinalizeUsingExcHan();
		System.out.println("HashCode is: " +obj.hashCode());
		//obj.finalize();
		obj=null;
		System.gc();
		System.out.println("The End of Garbage Collection");
		
	}

	protected void finalize() {
		System.out.println("Called the Finalize method()");
	}
}
