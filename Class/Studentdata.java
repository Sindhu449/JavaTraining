package com.java.Class;
//Java Program to demonstrate the use of the parameterized constructor.  
class Studentdata{  
  int id;  
  String name;  
  //creating a parameterized constructor  
  Studentdata(int i,String n){  
  id = i;  
  name = n;  
  }  
  //method to display the values  
  void display(){
	  System.out.println(id+" "+name);
	  }  
 
  public static void main(String args[]){  
  //creating objects and passing values  
  Studentdata s1 = new Studentdata(111,"Karan");  
  Studentdata s2 = new Studentdata(222,"Aryan");  
  //calling method to display the values of object  
  s1.display();  
  s2.display();  
 }  
}  