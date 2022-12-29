package com.techouts.strmstasks;

import java.time.LocalDate;

public class Question4Date {

	public static void main(String[] args) {

		LocalDate date=LocalDate.now();
		System.out.println("original format\n"+date);
		int dd=date.getDayOfMonth();
		int mm=date.getMonthValue();
		int yy=date.getYear();
		System.out.println("after formatting the date:");
		System.out.printf("%d-%d-%d",dd,mm,yy);
	}

}
