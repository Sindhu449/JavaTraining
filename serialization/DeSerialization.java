package com.java.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerialization  {
	public static void main(String[] args) {
		try {
			ObjectInputStream in   = new ObjectInputStream(new FileInputStream("f.java"));
			Student s = (Student)in.readObject();
			System.out.println(s.id+ "" +s.name);
			in.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
