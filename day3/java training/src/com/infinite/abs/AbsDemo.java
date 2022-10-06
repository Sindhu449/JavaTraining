package com.infinite.abs;

abstract class Training{
	abstract void name();
	abstract void email();
}
class Sindhu extends Training{

	@Override
	void name() {
		System.out.println("name is Sindhu...");
		// TODO Auto-generated method stub
		
	}

	@Override
	void email() {
		System.out.println("email is sindhu@gmail.com");
		// TODO Auto-generated method stub
		
	}
	
}
class Javed extends Training{

	@Override
	void name() {
		System.out.println("Name is Javed...");
		// TODO Auto-generated method stub
		
	}

	@Override
	void email() {
		System.out.println("Email is javed@gmail.com");
		// TODO Auto-generated method stub
		
	}
	
}
class Yeswanth extends Training{

	@Override
	void name() {
		System.out.println("Name is yaswanth...");
		// TODO Auto-generated method stub
		
	}

	@Override
	void email() {
		System.out.println("Email is yeswanth@gmail.com");
		// TODO Auto-generated method stub
		
	}
	
}

public class AbsDemo {
	public static void main(String[] args) {
		Training[] arr = new Training[]{
				new Yeswanth(),
				new Sindhu(),
				new Javed()
				};
	for (Training t : arr) {
		t.name();
		t.email();
	}	
	}

}

