package com.techouts.collections4;

import java.util.ArrayList;

public class Question4b {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(2);
		al.add(5);
		al.add(7);
		System.out.println("original arraylist:");
		System.out.println(al);
		
		for(int i=0;i<al.size();i++)
		{
			int a=al.get(i)
					;
			for(int j=i+1;j<al.size();j++)
			{
				int b=al.get(j);
				if(a==b)
				{
					al.remove(j);
				}
			}
		
		}
		System.out.println(al);
	}

}
