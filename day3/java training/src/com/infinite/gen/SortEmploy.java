package com.infinite.gen;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {

	public static void main(String[] args) {
		Comparator c = new NameComparator();
		SortedSet<Employ> employList = new TreeSet<Employ>(c);
		employList.add(new Employ(1,"sindhu",897456));
		employList.add(new Employ(1,"hari",897356));
		employList.add(new Employ(1,"sindhu",896956));
		employList.add(new Employ(1,"josh",89756));
		for (Employ e : employList) {
			System.out.println(e);
		}
	
	}
}
