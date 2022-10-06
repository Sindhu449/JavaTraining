package com.infinite.intf;

interface Ione{
	void name();
}
interface Itwo{
	void email();
}

class Manu implements Ione,Itwo{

	@Override
	public void email() {
		System.out.println("Email is manu@gmail.com"); 
		// TODO Auto-generated method stub
		
	}

	@Override
	public void name() {
		System.out.println("Name is Manu");
		// TODO Auto-generated method stub
		
	}
	
}
public class MulInh {
	public static void main(String[] args) {
		Manu obj = new Manu();
		obj.name();
		obj.email();
	}

}
