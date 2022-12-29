package com.techouts.tasks;
import java.util.*;


public class Circle extends Shape{
	static double PI=3.14;
	void area(int l,int b)
	{
		double ar=PI*l*b;
		System.out.println("area of circle is:"+ar);
	}
	void perimeter(int a)
	{
		double pe=2*PI*a;
		System.out.println("perimeter of circle is:"+pe);

	}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length");
	int l=sc.nextInt();
	System.out.println("enter the breadth");
	int b=sc.nextInt();
	Circle c=new Circle();
	c.area(l,b);
	System.out.println("enter the side");
	int a=sc.nextInt();
	c.perimeter(a);
	}
	
}
