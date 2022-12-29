package com.techouts.streams;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList();
		for(int i=0;i<=20;i++)
		{
			if(i%5==0)
			al.add(i);
		}
		System.out.println("original list \n"+al);
		//map
		List<Integer> al3=al.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println("adding every element using map\n"+al3);
		//filtering mapped elements 
		List<Integer> al2=al3.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("after filtering \n"+al2);
		
	}

}
