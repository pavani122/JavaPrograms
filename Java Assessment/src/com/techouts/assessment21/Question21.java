package com.techouts.assessment21;

import java.util.Scanner;

public class Question21 {
	
	private static final int plus = 1;
	private static final int minus = 2;
	private static final int multiply = 3;
	private static final int divide = 4;
	public double calculate(double a,double b)
	{
		System.out.println("Enter the choice\n 1.plus \t2.minus\t3.multiply\t4.divide");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(choice==plus) {
			System.out.println(a+b);
		return a+b;}
		else if(choice==minus) {
			System.out.println(a-b);
			return a-b;}
		else if(choice==multiply) {
			System.out.println(a*b);
			return a*b;}
		else if(choice==divide) {
			System.out.println(a/b);
			return a/b;}
		else {
			try {
			throw new AssertionError();}
			catch(AssertionError e) {
			System.out.println("Enter valid number\n"+e);}
			}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a:");
		double a=sc.nextDouble();
		System.out.println("Enter value of b:");
		double b=sc.nextDouble();
		Question21 obj=new Question21();
		obj.calculate(a, b);
	}

}
