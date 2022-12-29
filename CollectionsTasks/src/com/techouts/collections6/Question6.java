/*Write a program to convert HashSet to Array?*/
package com.techouts.collections6;
import java.util.*;

public class Question6 {

	public static void main(String[] args) {

		HashSet hs=new HashSet();
		hs.add(100);
		hs.add(2);
		hs.add(626);
		hs.add(23);
		hs.add(882);
        System.out.println("elements of HashSet are: ");
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("**********converting hashset to array*************");
		Integer[] arr=new Integer[5];
		hs.toArray(arr);
		System.out.println("elements of array are: ");
		for(Integer i:arr)
		{
			System.out.println(i);
		}
		
	}

}
