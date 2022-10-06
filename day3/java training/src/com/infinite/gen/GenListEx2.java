package com.infinite.gen;

import java.util.ArrayList;
import java.util.List;

public class GenListEx2 {

	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1,"sindhu",89756));
		employList.add(new Employ(2,"hk",78955));
		employList.add(new Employ(3,"manu",21652));
		employList.add(new Employ(4,"josh",154523));
		for (Employ e : employList) {
             System.out.println(e);			
		}
	}
}
