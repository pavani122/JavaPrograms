package com.techouts.collections;

import java.util.Comparator;

public class Comperator1 implements Comparator {
			public int compare(Object obj1,Object obj2)
			{
			Integer I1=(Integer)obj1;
			Integer I2=(Integer)obj2;
			if(I1<I2)
			{
				return +1;
			}
			else if(I1>I2)
			{
				return -1;
			}
			else
			{
				return 0;
			}
			
			}		
}
