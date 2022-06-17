package com.techouts.collections;
import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		//adding elements
		al.add("apple");
		al.add("orange");
		al.add("banana");
		al.add("mango");
		System.out.println(al);
		
		//adding elements at specified position
		al.add(2,"pineapple");
		System.out.println(al);
		
		//changing the elements 
		al.set(1, "watermelon");
		al.set(4, "custardapple");
		System.out.println(al);
		
		//deleting the elements
		al.remove("apple");
		
		System.out.println(al);
		al.remove(0);
		
	}

}
