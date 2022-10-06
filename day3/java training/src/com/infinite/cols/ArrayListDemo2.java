package com.infinite.cols;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		List employList = new ArrayList();
		employList.add(new Employ(1,"vaishu",165432));
		employList.add(new Employ(2,"hari",94971));
		employList.add(new Employ(3,"josh",98997));
		employList.add(new Employ(4,"h",85465));
		employList.add(new Employ(5,"varsha",78954));
		for (Object ob : employList) {
			Employ employ = (Employ)ob;
			System.out.println(employ);
			
		}
	}
}
