package com.java.MuteImmute;

//immutable Strings are declared as final so, we cant change values
public class Immutable {
	private final String s;
	Immutable(final String s){
		this.s = s;
	}
	public final String getString() {
		return s;
		
	}
	public static void main(String[] args) {
		Immutable i = new Immutable("Java Programming LAnaguage");
		System.out.println(i.getString());
	}
	

}
