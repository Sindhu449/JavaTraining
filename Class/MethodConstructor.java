package com.java.Class;

class Employee{
	int empid;
	String name;
	double salary;
	Employee(int id, String ename, double salary){
		this.empid = id;
		this.name=ename;
		this.salary=salary;
	}
	void display() {
		System.out.println("Employee Details");
		System.out.println("Id is:  "  + empid +  "  Name is:   "+name  + "  Salary is:  " +salary);
	}
}
public class MethodConstructor {

	public static void main(String[] args) {
		Employee emp = new Employee(1029883, "Sindhu", 30.000);
		emp.display();
	}
}
