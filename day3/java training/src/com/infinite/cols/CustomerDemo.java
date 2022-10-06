package com.infinite.cols;

import java.util.ArrayList;
import java.util.List;

public class CustomerDemo {

	public static void main(String[] args) {
		List customer = new ArrayList();
		customer.add(new Customer(1,"Hari","maharastra",85985));
		customer.add(new Customer(2,"manu","ananthapur",56865));
		customer.add(new Customer(3,"Sindhu","ananthapur",98756));
		customer.add(new Customer(4,"Varshitha","ananthapur",98762));
		for (Object ob : customer) {
			Customer customer1 = (Customer)ob;
			System.out.println(ob);
}
		
		
	}
}
