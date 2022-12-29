package com.techouts.streams;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.function.Consumer;

public class StreamForEach {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList();
		for(int i=0;i<=20;i++)
		{
			if(i%5==0)
			al.add(i);
		}
		//using for-each()
		
		al.stream().forEach(System.out::println);
		
		//to convert arraylist to array using stream()
		
		Integer[] arr=al.stream().toArray(Integer[]::new);
		System.out.println("Array of integers is:");
		 //for each loop
		System.out.println("using for-each loop");
		for(Integer i:arr)
		{
			System.out.println(i);
		}
		
		//for each method
		System.out.println("using for-each method");
		Stream.of(arr).forEach(System.out::println);
		
		//using consumer in for-each
		System.out.println("square of every element");
		Consumer<Integer> c=i->{System.out.println((i*i));};
		al.stream().forEach(c);
	}

}

