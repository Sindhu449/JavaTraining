package com.java.Exceptionhandling;

public class ExcHanmethods {
	
	public static void main (String[] args) {
	      int a=5;
	      int b=0;
	        try{
	          System.out.println(a/b);
	        }
	      catch(ArithmeticException e){
	      e.printStackTrace();//using PrintStackTrace()  exception: description of the exception, stack
	      e.toString(); //using tiString() prints exception: description of the exception. 
	      e.getMessage(); // using prints only the description of the message
	      }
	        
	    }

}
