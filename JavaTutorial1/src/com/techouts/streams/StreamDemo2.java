package com.techouts.streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo2 {

	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList<>();
		al.add("Meghana");
		al.add("Jyothika");
		al.add("Durga");
		al.add("Keerthana");
		al.add("Yashashwini");
		System.out.println(al);
		//default sorting using streams
		
		List al1=al.stream().sorted().collect(Collectors.toList());
		System.out.println("After sorting\n"+al1);
		
		//customised sorting using streams in comperator(compare()) for integers
		
		//List al2=al.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
		//System.out.println(al2);
		
		//default sorting using comperable (compareTO())
		List al3=al.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("default sorting using compareTo()\n: "+al3);
		
		//customised sorting using comperable (compareTO())
		List al4=al.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println("customised sorting using compareTo()\n: "+al4);
	}

}
