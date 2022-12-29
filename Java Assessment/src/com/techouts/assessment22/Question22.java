package com.techouts.assessment22;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter company name:");
		String name=sc.next();
		System.out.println("Enter cp:");
		double cp=sc.nextDouble();
		System.out.println("Enter sp:");
		double sp=sc.nextDouble();
		Question22 obj=new Question22();
		Company c=(profit,n)->{ return profit+n;
		};
		System.out.println("Profit:"+c.profit(cp, sp));
		System.out.println("Company name:"+Company.name(name));
	}

}
