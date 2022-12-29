package com.techouts.collections;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {

		Vector<String> v=new Vector<>();
		v.add("a");
		v.add("b");
		v.add("c");
		for(String vec:v)
		{
			System.out.print(vec+"\t");
		}
		System.out.println();
		System.out.println("capacity of default constructor: "+v.capacity());
		Vector<String> v1=new Vector<>(3);
		v1.add("a");
		v1.add("a");
		v1.add("a");
		v1.add("a");
		for(String vec:v1)
		{
			System.out.print(vec+"\t");
		}
		System.out.println();
		System.out.println("capacity of single parameterized constructor: "+v1.capacity());
		Vector<String> v2=new Vector<>(4,6);
		v2.add("a");
		v2.add("b");
		v2.add("c");
		v2.add("c");
		v2.add("c");
		v2.add("c");
		v2.add("c");
		v2.add("c");
		v2.add("c");
		v2.add("c");
		v2.add("c");

		for(String vec:v2)
		{
			System.out.print(vec+"\t");
		}
		System.out.println();
		System.out.println("capacity of double parameterized constructor: "+v2.capacity());

		
	}

}
