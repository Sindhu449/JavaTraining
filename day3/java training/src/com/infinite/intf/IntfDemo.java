package com.infinite.intf;

interface ITraining{
	void name();
	void email();
}
class Sindhu implements ITraining{

	@Override
	public void name() {
		System.out.println("Name is Sindhu...");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void email() {
		System.out.println("email is sindhu@gmail.com");
		// TODO Auto-generated method stub
		
	}
	
}
class SaiKunche implements ITraining{

	@Override
	public void name() {
		System.out.println("Name is SaiKunche");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void email() {
		System.out.println("Email is SaiKunche@gmail.com");
		// TODO Auto-generated method stub
		
	}
	
}
public class IntfDemo {
	public static void main(String[] args) {
		ITraining[] arr = new ITraining[]{
				new SaiKunche(),
				new Sindhu()
		};
		for (ITraining i : arr) {
			i.name();
			i.email();
			
		}
	}

}
