/*Perform analysis on ListIterator and Iterator and provide your handson examples on each analysis.*/
package com.techouts.assessment9;
import java.util.*;

public class Question9 {

	public static void main(String[] args) {

		ArrayList<Integer> list=new ArrayList();
		for(int i=1;i<=5;i++)
			list.add(i);
		
		//1.iterating using iterator
		System.out.println("Printing elements using iterator");
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//2.iterating using listIterator
		System.out.println("Printing elements using listIterator");
		ListIterator<Integer> lit=list.listIterator();
		while(lit.hasNext())
		{
			Integer i=lit.next();
			if(i.equals(1)) {
				lit.add(11); }
			if(i.equals(2)) {
				lit.remove(); }
		}
		System.out.println(list);
		
	}

}
