package com.techouts.strmstasks;
import java.util.*;
import java.util.stream.Collectors;

public class Question2 {

	public static void main(String[] args) {

		List<Integer> list=new ArrayList<>();
		for(int i=1;i<=5;i++)
		{
			list.add(i);
		}
		for(int i=1;i<=10;i++)
		{
			list.add(i);
		}
		System.out.println("original list");
		list.stream().forEach(i->System.out.print(i+"\t"));
		
		
		//1.distinct
		System.out.println("\nthe list after using distinct \n");
		list.stream().distinct().forEach(i->System.out.print(i+"\t"));
		
		//2.limit
		System.out.println("\nthe list after using limit \n");
		list.stream().limit(5).forEach(i->System.out.print(i+"\t"));
		
		//3.skip
		System.out.println("\nthe list after using skip \n");
		list.stream().skip(10).forEach(i->System.out.print(i+"\t"));
		
		//4.peek
		System.out.println("\nthe list after using peek \n");
		List<Integer> newlist=list.stream().peek(i->System.out.print(i+"\t"))
		.collect(Collectors.toList());
		
		//5.flatMap
		System.out.println("\nthe list after using flatmap \n");
		list.addAll(newlist);
		//List<Integer>  flatmaplist=list.stream().flatMap(i->i.stream())
				//.collect(Collectors.toList());
		//System.out.println("the list using flatmap is:\n"+flatmaplist);
		

	}

}
