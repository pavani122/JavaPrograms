package com.techouts.interfaces;

interface intrf1
{
	default void m1()
	{
		System.out.println("this is intrdf1");
	}
	
	static void display()
	{
		System.out.println("....displays....");
	}
}

interface intrf2
{
	default void m1()
	{
		System.out.println("this is interf2");}
}

public class Demo2 implements intrf1,intrf2 {

	 public void m1()         //default method overrided
	 {
		 
		 intrf1.super.m1();
		 System.out.println("inertf1 overrided");
		 
		 
	 }
	public static void main(String[] args) {
		
		Demo2 d=new Demo2();
		intrf1.display();     //static method
		d.m1();               //default method
       
	}

}
