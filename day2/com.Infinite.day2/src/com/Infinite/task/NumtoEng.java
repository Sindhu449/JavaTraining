package com.Infinite.task;

public class NumtoEng {

	public static void main(String[] args) {
		String num="789";
		String[] hundreds={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		String[] tens={"Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
		String[] ones={"one","two","three","four","five","six","seven","eight","nine" };
		String result="";
		int len = num.length();
		if (len==3) {
		//	System.out.println(num.charAt(0));
			  int a = num.charAt(0) - '0';
			  System.out.println(a);
			//System.out.println(s);
			result+=hundreds[a-1] + " Hundred and ";
			int t = num.charAt(1) - '0';
			result+=tens[t-2] + ""; 
			int b = num.charAt(2)-'0';
			result+=ones[b-1];
		}
		System.out.println(result);
	}
}
