package datatype;

import java.util.Scanner;

public class Checkdata {
	public static void main(String[] args) {
		int intData;
		char charData;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String value: ");
		String str  = sc.nextLine();
		System.out.println("ENter a Integer value: ");
		intData = sc.nextInt();
		System.out.println("ENter a Character value: ");
		charData = sc.next().charAt(0);
		
		sc.close();
		System.out.println(intData + " is of type " +((Object)intData).getClass().getSimpleName());
		
		System.out.println(charData + " is of type " + ((Object)charData).getClass().getSimpleName());
		System.out.println(str + " is of tyoe " + ((Object)str).getClass().getSimpleName());
	}
	

}
 