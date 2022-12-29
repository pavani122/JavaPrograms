package com.techouts.strmstasks;

import java.time.LocalTime;

public class Question4Time {

	public static void main(String[] args) {

		LocalTime time=LocalTime.now();
		System.out.println("original format\n"+time);
		int h=time.getHour();
		int m=time.getMinute();
		int s=time.getSecond();
		int n=time.getNano();
		System.out.println("after formatting the time:");
		System.out.printf("%d:%d:%d:%d",h,m,s,n);
	}

}
