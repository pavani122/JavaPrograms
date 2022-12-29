/* User should be asked to enter any date.
	1 method checks if input date is earlier to present date.
	1 method checks if input date is after to present date.
	1 method converts given date into "yyyy-MM-dd HH:mm:ssZ" pattern.*/
package com.techouts.assessment6;

import java.time.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Date:"); 
		int dd=sc.nextInt();
		System.out.println("Enter the Month:"); 
		int mm=sc.nextInt();
		System.out.println("Enter the Year:"); 
		int yy=sc.nextInt();
		System.out.println("Enter the hour:");
		int h=sc.nextInt();
		System.out.println("Enter the minutes:");
		int m=sc.nextInt();
		System.out.println("Enter the seconds:");
		int s=sc.nextInt();
		TimeEarliest dateEarly=new TimeEarliest();
		dateEarly.earliest(yy, mm, dd);
		DateConvert dc=new DateConvert();
		dc.convert(yy, mm, dd, h, m, s);
	}

}
