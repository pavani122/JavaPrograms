package com.techouts.tasks;
import java.util.Scanner;


class Mobile {
	long num1;
	
	long person(long num1)
	{
		System.out.println("first number:"+num1);
		return 0;
	}
}

public class Person extends Mobile{
	long num2;

	long person(long num2)
	{
		System.out.println("second number:"+num2);

		return 0;
		
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		long num1=sc.nextLong();
		System.out.println("enter the second number");
		long num2=sc.nextLong();
		Mobile m;
		m=new Mobile();
		m.person(num1);
		m=new Person();
		m.person(num2);
		
	}

}
