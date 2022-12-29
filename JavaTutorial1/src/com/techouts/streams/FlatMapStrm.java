package com.techouts.streams;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class FlatMapStrm {

	public static void main(String[] args) {

		List<String> list1=Arrays.asList("apple","banana","orange");
		List<String> list2=Arrays.asList("car","bus","bike");
		List<String> list3=Arrays.asList("cake","biscuit","chocolate");
		
		List<List<String>> allist=new ArrayList<List<String>>();
		allist.add(list1);
		allist.add(list2);
		allist.add(list3);
		
		List<String> mainlist=new ArrayList();

		for(List<String> str:allist)
		{
			for(String s:str)
			{
				mainlist.add(s);
			}
		}

		System.out.println("the list is:\n"+mainlist);

		//using flatmap method
		
		List<String>  flatmaplist=allist.stream().flatMap(i->i.stream())
				.collect(Collectors.toList());
		System.out.println("the list using flatmap is:\n"+flatmaplist);
		
	}

}
