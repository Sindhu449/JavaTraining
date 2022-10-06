package com.Infinite.day2;

enum WeekDays {
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}
public class Enumex1 {
 
	public static void main(String[] args) {
		WeekDays wd = WeekDays.TUESDAY;
		System.out.println(wd);
		String str = "FRIDAY";
		wd = WeekDays.valueOf(str);
		System.out.println(wd);
	}
}
