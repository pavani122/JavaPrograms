package com.techouts.tasks;

public class Box3D extends Box {
	int l,b,h;
	Box3D(int l,int b,int h)
	{
		this.l=l;
		this.b=b;
		this.h=h;
	}

	void area()
	{
		System.out.println("Area of Box3D is: "+(l*b));
	}
	void volume()
	{
		System.out.println("Volume of Box3D is: "+(l*b*h));
	}
}
