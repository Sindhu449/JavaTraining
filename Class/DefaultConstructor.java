package com.java.Class;

public class DefaultConstructor {
		   double length;
		   double width;
		    
		    // displays the default value of double type
		    void display() {
		       System.out.println("Length = "+length);
		       System.out.println("Width = "+width);
		    }
		 
		public static class Main {
		    public static void main(String[] args) {
		     
		    	DefaultConstructor con = new DefaultConstructor();
		      con.display();
		    }
		}

}
