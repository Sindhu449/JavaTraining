package com.java.test;

public class Switch {
	public static void main(String[] args) {
		int day = 3;
		String dayString;
		switch (day) {
		case 1:
			dayString = "Monday";
			break;
		case 2:
			dayString = "Tuesday";
			break;
		case 3:
			dayString = "Wednesday";
			break;
		case 4:
			dayString = "Thursday";
			break;
		case 5:
			dayString = "Friday";
			break;
		case 6:
			dayString = "saturday";
			break;
		case 7:
			dayString = " Sunday";
			break;
		default:
			dayString = "Invalid Day";
		}
		System.out.println(dayString);
	}
	

}
