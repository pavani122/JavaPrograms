/*Write a program to reverse ArrayList in java?*/
package com.techouts.collections7;
import java.util.*;

public class Question7 {

	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList<>();
		al.add("raghu");
		al.add("vishu");
		al.add("vamshi");
		al.add("ramesh");
		ListIterator ltr=al.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		System.out.println("**********after reversing the arraylist***********");
		Collections.reverse(al);
		ListIterator ltr1=al.listIterator();
		while(ltr1.hasNext())
		{
			System.out.println(ltr1.next());
		}
	}

}
