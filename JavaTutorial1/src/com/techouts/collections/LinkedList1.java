package com.techouts.collections;
import java.util.*;

public class LinkedList1 {

	public static void main(String[] args) {

		LinkedList<String> ll=new LinkedList<>();
		ll.add("a");
		ll.add("b");
		ll.add("c");
		for(String l1:ll)
		{
			System.out.print(l1+"\t");
		}
		System.out.println();
		ll.add(3,"d");
		ll.add(0,"0");
		for(String l1:ll)
		{
			System.out.print(l1+"\t");
	    }
		System.out.println();
		LinkedList<String> LL=new LinkedList<>();
		LL.addAll(ll);
		for(String l1:LL)
		{
			System.out.print(l1+"\t");
	    }
		System.out.println();
		LL.addFirst("first element");
		LL.addLast("last element");
		for(String l1:LL)
		{
			System.out.print(l1+"\t");
	    }

		
		
	}
	

}
