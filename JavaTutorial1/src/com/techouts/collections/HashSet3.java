package com.techouts.collections;
import java.util.*;

public class HashSet3 {

	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add("a");
		h.add("b");
		h.add("c");
		System.out.println(h);
		//creation of array
		String[] arr=new String[3];
		h.toArray(arr);
		for(String a:arr)
		{
			System.out.println(a);
		}
		//creation of arraylist
		ArrayList al=new ArrayList(h);
		System.out.println("arraylist: "+al);
		//creation of linkedlist
		LinkedList ll=new LinkedList(h);
		System.out.println("linkedlist: "+al);
		

	}

}
