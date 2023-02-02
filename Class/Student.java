package com.java.Class;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;
class Students{
	   String name ;
	    String college ;
	    
//	Students(String name, String college){
//		
//		this.name=name;
//		this.college=college;
//	}

//	void display() {
//		System.out.println("this isname="+ name +"this is college"+ college);
//	}	
//	
	void show(String name, String college) {
		name=name;
		college=college;
		System.out.println("this isname   "+ name +"    this is college  "+ college);
	}
}
public class Student {
public static void main(String[] args) {
	Students student= new Students();
	//student.display();
//	student.show("sindhu","vbc");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter name and college");
	String name=sc.next();
	String college=sc.next();
	student.show(name,college);
}
    
 }