package com.java.MuteImmute;

public class Mutable {
	private String s;
    Mutable(String s)
    {
    	this.s=s;
    }
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
    public static void main(String[] args) {
		Mutable str = new Mutable("Sindhu");
		System.out.println(str.getS());
		str.setS("Hari");
		System.out.println(str.getS());
	}
    

}
