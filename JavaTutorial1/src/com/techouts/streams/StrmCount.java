package com.techouts.streams;

import java.util.ArrayList;

public class StrmCount {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList<>();
		for(int i=1;i<=20;i++)
		{
		al.add(i);
		}
		
		System.out.println("the number of elments in original list");
		long c=al.stream().count();
		System.out.println(c);
		System.out.println("the number of elements after filtering is");
		long c1=al.stream().filter(i->i%6==0).count();
		System.out.println(c1);
		
	}

}
