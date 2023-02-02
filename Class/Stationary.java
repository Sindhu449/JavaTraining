package com.java.Class;

class Things{
	int penqnty;
	String penname;
	double cost;
	
//	Things(){
//		
//	}
	Things(int pen, String name, double cost){
		 this.penqnty =pen; 
		this.penname= name;
		 this.cost=cost;
	}
	void buy() {
		int total=(int) (penqnty*cost);
		System.out.println("Stationary Shop");
		System.out.println("Pen Quantity: "+penqnty+" Pen name:  "+penname+ " cost of pen:  "+cost+"total prize=" + total);
	}
	
//	double totalPice(int quantity, double cost) {
//		
//		return quantity*cost;
//	}
}
public class Stationary {
	public static void main(String[] args) {
		Things t = new Things(10, "Flair", 20);
//		Things t1  = new Things();
//		t1.buy();
		//System.out.println(t.totalPice(10, 20));
		t.buy();
	}

}
