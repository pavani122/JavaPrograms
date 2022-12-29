package com.techouts.collections;
import java.util.*;

import java.util.LinkedList;

public class LinkedList4 {
 
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add("m1");
		l1.add(1);
		l1.add("m2");
		l1.add(2);

		for(Object l:l1)
		{
			System.out.print(l+"\t");
		}
		System.out.println();
		System.out.println(l1.contains("m"));
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		System.out.println(l1.indexOf("m1"));
		System.out.println(l1.get(2));
	}

}
