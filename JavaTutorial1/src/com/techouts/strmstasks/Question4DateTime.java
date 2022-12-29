package com.techouts.strmstasks;

import java.time.LocalDateTime;

public class Question4DateTime {

	public static void main(String[] args) {

		LocalDateTime dt=LocalDateTime.now();
		System.out.println("both date and time:\n"+dt);
		System.out.println("------------------------------");
		//to get the specified date
		LocalDateTime d1=LocalDateTime.of(2002,02,01,8,12);
		System.out.println("to get the specified date:\n"+d1);
		System.out.println("------------------------------");

		//after 6 months
		System.out.println("after 6 months:\n"+d1.plusMonths(6));
		System.out.println("------------------------------");
		System.out.println("before 6 months:\n"+d1.minusMonths(6));
	}

}
