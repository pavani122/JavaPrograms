package com.techouts.collections;
import java.util.*;

public class ArrayList2 {

	public static void main(String[] args) {

		ArrayList<Integer> obj=new ArrayList<>();
		obj.add(45);//add method
		obj.add(34);
		obj.add(55);
		obj.add(0);
		System.out.println("original arraylist: ");
		for(int i:obj)
		{
			System.out.print(i+"\t");
		}
		obj.add(3,88);//add at index method
		System.out.println("\narraylist after adding element at specified index: ");
		for(int i:obj)
		{
			System.out.print(i+"\t");
		}
		obj.set(2,99);//set method
		System.out.println("\narraylist after changing element at specified index:  ");
		for(int i:obj)
		{
			System.out.print(i+"\t");
		}
		//obj.remove("45");
		obj.remove(2);//remove method
		System.out.println("\narraylist after removing elements at specified index:  ");
		for(int i:obj)
		{
			System.out.print(i+"\t");
		}
		System.out.println("\nsize of the list is: "+obj.size());//size method
		Collections.sort(obj); //sort method
		System.out.println("\narraylist after sortig elements at specified index: ");
		for(int i:obj)
		{
			System.out.print(i+"\t");
		}
		System.out.println("\nindex of element 45 is "+obj.indexOf(45));//indexOf() method
		System.out.println("element at specified index is "+obj.get(3));//get(index) method
		obj.clear();
	    System.out.println("elements after removing all: ");
	    for(int i:obj)
	    {
	    	System.out.println("\t"+i);
	    }
	}

}
