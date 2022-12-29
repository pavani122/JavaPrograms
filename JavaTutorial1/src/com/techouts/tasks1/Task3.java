package com.techouts.tasks1;
import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("which fruit you are searching for:");
		String s=sc.next();
		ArrayList<String> al=new ArrayList<>();
		al.add("apple");
		al.add("mango");
		al.add("banana");

		boolean b=false;
		if(al.contains(s))
		{
			b=true;
		}
		
				try {
					if(b==true) {
				      throw new OwnException("it is already present in the list");
					}
				    else
						{
							System.out.println("Thank you for your information");
						}             
				}
		
		
					catch(Exception e)
					{
						System.out.println(e);
						System.out.println("..................................");
						System.out.println("please try enter something new");
					}
	}
	}

