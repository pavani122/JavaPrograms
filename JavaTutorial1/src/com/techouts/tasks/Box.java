package com.techouts.tasks;

public class Box {

	int l,b,h;
	Box()
	{
		
	}
	Box(int l,int b,int h)
	{
		this.l=l;
		this.b=b;
		this.h=h;
	}
	void area()
	{
		System.out.println("Area of Box is: "+(l*b));
	}
	void volume()
	{
		System.out.println("Volume of Box is: "+(l*b*h));
	}
}
