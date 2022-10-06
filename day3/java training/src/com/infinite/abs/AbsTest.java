package com.infinite.abs;

abstract class Vehicle{
	abstract void name();
	abstract void type();
}
class Scross extends Vehicle{

	@Override
	void name() {
		System.out.println("Name is Scross");
		// TODO Auto-generated method stub
		
	}

	@Override
	void type() {
		System.out.println("Its four wheeler");
		// TODO Auto-generated method stub
		
	}
	
}
class PassionPro extends Vehicle{

	@Override
	void name() {
		System.out.println("Name is Passion pro");
		// TODO Auto-generated method stub
		
	}

	@Override
	void type() {
		System.out.println("Its two wheeler...");
		// TODO Auto-generated method stub
		
	}
	
}
public class AbsTest {
	public static void main(String[] args) {
		Vehicle[] arr = new Vehicle[]{
			new PassionPro(),
			new Scross()
		};
		for (Vehicle v : arr) {
			v.name();
			v.type();
			
		}
	}

}
