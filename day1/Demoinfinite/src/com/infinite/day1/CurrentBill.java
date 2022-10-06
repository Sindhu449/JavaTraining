package com.infinite.day1;

public class CurrentBill {

	public void show(int units) {
		double rate,bill=0;
		if(units <=90) {
			rate = 1;
			bill=rate*units;
	   }
		if(units > 90){
			rate=1;
			bill=rate*90;
			if(units -90 >60) {
				rate = 1.5;
				bill=bill+(rate*60);
			}else{
				rate=1.5;
				bill=bill+((units-90)*rate);
			}
		}
		if(units >150){
			rate = 2;
			if (units -150 >50){
				bill+=(rate*50);
			}else{
				bill+=rate*(units-150);
			}
		}
		if(units >200){
			rate = 2.5;
			if(units -200 >40){
				bill+=(rate*40);
			}else {
				bill+=rate*(units-200);
			}
		}
		if(units >240){
			rate = 3;
			if(units - 240 >40){
				bill+=(rate*40);
			}else {
				bill+=rate*(units-240);
			}
		}
		
		System.out.println(bill);
		}
	public static void main(String[] args) {
		int units = 250;
		CurrentBill obj = new CurrentBill();
		obj.show(units);
	}
}
