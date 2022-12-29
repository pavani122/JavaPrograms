package com.techouts.collections;
import java.util.*;

public class HashSet2 {

	public static void main(String[] args) {

		HashSet hs=new HashSet();
		hs.add("a");
		hs.add("b");
		hs.add("c");
		hs.add(null);
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println(hs.contains("b"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.remove("c"));
		System.out.println(hs.contains("c"));
		System.out.println(hs.size());
		hs.clear();
		System.out.println("after removing all the elements"+hs);
		
	}

}
