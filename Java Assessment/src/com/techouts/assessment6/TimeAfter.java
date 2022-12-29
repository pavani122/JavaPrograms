package com.techouts.assessment6;

import java.time.LocalDate;

public class TimeAfter {

	public void after(int yy,int mm,int dd)
	{
		LocalDate date=LocalDate.now();
		LocalDate anyDate=LocalDate.of(yy, mm,dd);
		boolean a=anyDate.isAfter(date);

			if(a==true)
			{
				System.out.println("It is after to present dateeeeeee");
			
			}
			else
			{
				System.out.println("It is today's Date");
			}
		

	}
}
