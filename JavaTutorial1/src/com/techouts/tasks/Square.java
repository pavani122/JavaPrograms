package com.techouts.tasks;

import java.util.Scanner;

public class Square extends Shape {
	
	void area(int l,int b)
	{
		int ar=l*b;
		System.out.println("area of square: "+ar);
	}
	void perimeter(int a)
	{
		double pe=a*a;
		System.out.println("perimeter of sqaure is:"+pe);

	}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length");
	int l=sc.nextInt();
	System.out.println("enter the breadth");
	int b=sc.nextInt();
	Square c=new Square();
	c.area(l,b);
	System.out.println("enter the side");
	int a=sc.nextInt();
	c.perimeter(a);
	}
	
}
