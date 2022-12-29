
package com.techouts.assessment6;
import java.time.LocalDateTime;
import java.util.Scanner;

public class DateConvert 

    {
		void convert(int yy,int mm,int dd,int h,int m,int s)
		{
		LocalDateTime dt1=LocalDateTime.of(yy, mm, dd, h, m, s);	
		System.out.printf("%d-%d-%d %d:%d:%dZ",yy,mm,dd,h,m,s);
		}
    }