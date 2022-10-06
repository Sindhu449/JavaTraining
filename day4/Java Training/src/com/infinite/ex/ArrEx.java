package com.infinite.ex;

public class ArrEx {

	public static void main(String[] args) {
		int[] a={12,25};
		
		try {
			a[10]=90;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("array size is small");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
