package com.techouts.streams;

import java.util.ArrayList;

public class StrmMatch {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList<>();
		for(int i=1;i<=20;i++)
		{
		al.add(i);
		}
		
		boolean allmatch=al.stream().allMatch(i->i%5==0);
		System.out.println(allmatch);
		
		boolean anymatch=al.stream().anyMatch(i->i%5==0);
		System.out.println(anymatch);
		
		boolean nonematch=al.stream().noneMatch(i->i%2==0);
		System.out.println(nonematch);
	}

}
