package com.java.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class Serialization {

	public static void main(String[] args) {
		try {
			//Creation object
			Student s1 = new Student(122, "Sindhu");
			//creating Stream and writing the object
			FileOutputStream fout = new FileOutputStream("F.java");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(s1);
			out.flush();
			//closing the Stream
			out.close();
			System.out.println("Success");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
