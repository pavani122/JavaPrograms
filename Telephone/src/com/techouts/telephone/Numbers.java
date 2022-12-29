package com.techouts.telephone;
import java.util.Scanner;

public class Numbers {

	
	static String name;static long number;
	static Scanner sc=new Scanner(System.in);
	static String getNumber()
	{
		System.out.println("Enter the name:");
		name=sc.next();
		System.out.println("Enter the mobile number:");
		number=sc.nextLong();
		return name+":"+number;
	}
	
	 static void checkdata()
	{
		String data=Numbers.getNumber();
		System.out.println(data);
	}
	public static void main(String[] args) {
		
		Numbers.checkdata();
	}
}
