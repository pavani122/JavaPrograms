package com.techouts.tasks;

import java.util.Scanner;

class Personn
{
	void person(long num1,long num2)
	{
		System.out.println(num1+num2);
	}
	void person(long num1,long num2,long num3)
	{
		System.out.println(num1+num2+num3);
	}
}
public class CellPhone {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int num1=sc.nextInt();
		System.out.println("enter the second number");
		int num2=sc.nextInt();
		System.out.println("enter the third number");
		int num3=sc.nextInt();
		Personn m=new Personn();
		m.person(num1,num2);
		m.person(num1,num2,num3);
	}

}
