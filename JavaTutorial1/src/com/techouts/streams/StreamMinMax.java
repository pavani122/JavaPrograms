package com.techouts.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMinMax {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList<>();
		for(int i=1;i<=20;i++)
		{
		al.add(i);
		}
		System.out.println(al);
		
		System.out.println("In default sorting:");
		Integer min=al.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Minimum value: "+min);
		
		Integer max=al.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Maximum value: "+max);
		
		System.out.println("In customised sorting:");
		Integer min1=al.stream().min((i1,i2)->i2.compareTo(i1)).get();
		System.out.println("Minimum value: "+min1);
		
		Integer max1=al.stream().max((i1,i2)->i2.compareTo(i1)).get();
		System.out.println("Maximum value: "+max1);
	}

}
