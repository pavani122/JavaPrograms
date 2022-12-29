package com.techouts.interfaces;

public interface MyInterface {
	
	default String m1(String s)
	{
		System.out.println(s);
		return s;
	}
	
	public static void main(String[] args) {
		
	System.out.println("this is main method");
	
	new MyInterface()
	{
		
	}.m1("default method");
		
	}

}
