package com.techouts.interfaces;

interface Interface1 
{
	void m1();
}
interface Interface2
{
	void m1();

}
public class Demo implements Interface1,Interface2{

	public void m1()
	{
		System.out.println("this is m1 method");
	}
	public static void main(String[] args) {
		
		Demo d=new Demo();
		d.m1();
		
	}

}
