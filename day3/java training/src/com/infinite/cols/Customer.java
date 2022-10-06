package com.infinite.cols;

public class Customer {

	int CustId;
	String name;
		String city;
	double premium;
	@Override
	public String toString() {
		return "Customer [CustId=" + CustId + ", city=" + city + ", premium=" + premium + "]";
	}
	
	public Customer(int custId, String name, String city, double premium) {
		super();
		CustId = custId;
		this.name = name;
		this.city = city;
		this.premium = premium;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
}
