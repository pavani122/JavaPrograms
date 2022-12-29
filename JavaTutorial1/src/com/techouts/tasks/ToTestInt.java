package com.techouts.tasks;
import java.util.Scanner;

public class ToTestInt {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		int l=sc.nextInt();
		System.out.println("enter the breadth");
		int b=sc.nextInt();
		Arithmetic c=new Arithmetic();
		c.square(l,b);
	}

}
