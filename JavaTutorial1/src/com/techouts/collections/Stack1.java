package com.techouts.collections;
import java.util.*;

public class Stack1 {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push("a"); //push method
		s.push("b");
		s.push("c");
		System.out.println(s);
		System.out.println(s.search("a")); //search method
		ListIterator li=s.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		s.pop();
		System.out.println(s);
		System.out.println(s.peek()); //peek method
		System.out.println(s.empty());//
		System.out.println(s.search("a"));

	}

}
