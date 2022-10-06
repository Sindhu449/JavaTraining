package com.infinite.gen;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.FactoryConfigurationError;

public class GenListEx1 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("sindgu");
		names.add("sai");
		names.add("hari");
		for (String s : names) {
			System.out.println(s);
			
		}
	}
}
