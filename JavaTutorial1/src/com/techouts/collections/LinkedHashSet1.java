package com.techouts.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
       
		LinkedHashSet hs=new LinkedHashSet();
		hs.add("a");  //maintains insertion order
		hs.add("b");
		hs.add("c");
		hs.add(null);
		hs.add("a");
		System.out.println("original linkedhashset "+hs);
		System.out.println("duplicate value insertion: "+hs.add(null));
		System.out.println("original linkedhashset contains null "+hs.contains(null));
		System.out.println("original linkedhashset size "+hs.size());
		System.out.println("using iterator for linkedhashset");
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		hs.clear();
		System.out.println("original linkedhashset is empty after clear method "+hs.isEmpty());
		
	}

}
