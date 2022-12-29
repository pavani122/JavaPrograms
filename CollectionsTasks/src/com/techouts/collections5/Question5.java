/*Write a program to convert LinkedList to ArrayList?*/

package com.techouts.collections5;
import java.util.*;

public class Question5 {

	public static void main(String[] args) {
        //creation of linkedlist
		LinkedList obj1=new LinkedList();
		obj1.add("1");
		obj1.add("orange");
		obj1.add("apple");
		obj1.add("3");
		obj1.add("5");
		System.out.println("original linkedlist");
		System.out.println(obj1);
		
		//adding all the elements from linkedlist to arraylist
		ArrayList obj2=new ArrayList(obj1);
		System.out.println("**********after adding all the elements from linkedlist to arraylist**********");
		System.out.println(obj2);
		

		
	}

}
