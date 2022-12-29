package com.techouts.assessment19;

import java.util.Scanner;

public class Question19 {

	public void toString(String name) throws InvalidUserException
	{
		if(name.length()<10 || name.contains("&"))
		{
			try {
			throw new InvalidUserException("Invalid username \n name should be above 10 characters and must contain &");}
			catch(InvalidUserException e) {
				System.out.println(e);
			}
		}
		else
			System.out.println("ThankYou");
	}
	public static void main(String[] args) throws InvalidUserException {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the username:");
		String name=sc.next();
		Question19 obj=new Question19();
		obj.toString(name);
		}

}
