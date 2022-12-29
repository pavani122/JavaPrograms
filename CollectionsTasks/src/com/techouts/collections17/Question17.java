/* A school offers medals to the students of tenth based on the following criteria
If(Marks>=90) : Gold
If(Marks between 80 and 90) : Silver
If(Marks between 70 and 80) : Bronze
Note: Marks between 80 and 90 means marks>=80 and marks<90
Write a function which accepts the marks of students as a Hashmap and
 return the details of the students eligible for the medals along with type of medal.
The input hashmap contains the student registration number as key and mark as value.
The output hashmap should contain the student registration number as key and the medal type as value.*/

package com.techouts.collections17;
import java.util.*;

public class Question17 {

	public static void main(String[] args) {

		TreeMap<Integer,Integer> hmap1=new TreeMap();
		TreeMap<Integer,String> hmap2=new TreeMap();

		hmap1.put(1, 78);
		hmap1.put(13, 91);
		hmap1.put(21, 82);
		hmap1.put(11, 93);
		hmap1.put(9, 99);
		System.out.println(hmap1);
		
		for(Integer s:hmap1.keySet())
		{
			if(hmap1.get(s)>=90)
			{
				hmap2.put(s,"Gold");
			}
			else if(hmap1.get(s)>=80 && hmap1.get(s)<90)
			{
				hmap2.put(s,"Silver");
			}
			else if(hmap1.get(s)>=70 && hmap1.get(s)<80)
			{
				hmap2.put(s,"Bronze");
			}
		}
		
		System.out.println(hmap2);

	}

}
