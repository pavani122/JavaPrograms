package com.techouts.streams;

import java.util.*;
import java.util.stream.*;

public class CmprDemo {

	public static void main(String[] args) {

		ArrayList<String> list=new ArrayList<>();
		list.add("A");
		list.add("AAAAA");
		list.add("AA");
		list.add("AAAA");
		list.add("AAAA");
		list.add("AAA");
		System.out.println("Original list:\n"+list);
		
		Comparator<String> c= (s1,s2)->{
		int l1=s1.length();
		int l2=s2.length();
		if(l1<l2)
			return -1;
		else if(l1>l2)
			return 1;
		else
			return s1.compareTo(s2);
		};
		
		List listSorted=list.stream().sorted(c).collect(Collectors.toList());
		System.out.println("List after sorting \n"+listSorted);
		
		
		
		
		
	}

}
