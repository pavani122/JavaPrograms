package com.techouts.assessment6;

import java.time.LocalDate;

public class TimeEarliest {
	
	public void earliest(int yy,int mm,int dd)
	{
	
		LocalDate date=LocalDate.now();
		LocalDate anyDate=LocalDate.of(yy, mm,dd);
		boolean a=anyDate.isBefore(date);
		if(a==true)
		{
			System.out.println("It is earliest to present date");

		}
		else 
		{
			TimeAfter dateAfter=new TimeAfter();
			dateAfter.after(yy, mm, dd);
			
		}
	}
}

