package com.techouts.tasks;

import java.util.Scanner;

public class Triangle extends Shape {
	
	void area(int l,int b)
	{
		double ar=0.5*l*b;
		System.out.println("area of triangle: "+ar);
	}
	void perimeter(int a)
	{
		double pe=a+a+a;
		System.out.println("perimeter of triangle is:"+pe);

	}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length");
	int l=sc.nextInt();
	System.out.println("enter the breadth");
	int b=sc.nextInt();
	Triangle c=new Triangle();
	c.area(l,b);
	System.out.println("enter the side");
	int a=sc.nextInt();
	c.perimeter(a);
	}
	
}