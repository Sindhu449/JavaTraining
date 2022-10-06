package com.infinite.cols;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Sindhu");
		names.add("Hari");
		names.add("sai");
		names.add("varsha");
		names.add("varshini");
		System.out.println("Names are  ");
		for (Object ob : names) {
			System.out.println(ob);
			
		}
	}
}
