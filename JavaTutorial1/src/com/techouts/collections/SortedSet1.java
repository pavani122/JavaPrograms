package com.techouts.collections;
import java.util.*;

public class SortedSet1 {

	public static void main(String[] args) {

		SortedSet s=new TreeSet(); //default sorting order
		s.add("a");
		s.add("c");
		s.add("j");
		s.add("e");
		s.add("z");
		System.out.println("D S O: "+s);
		SortedSet s1=new TreeSet();
		s1.add(1);
		s1.add(34);
		s1.add(39);
		s1.add(24);
		s1.add(0);
		System.out.println("D S O: "+s1);
		System.out.println("a".compareTo("c"));
		//adding elements from one treeSet to another treeSet
		SortedSet s2=new TreeSet(s1);
		System.out.println(s2);
		
	}

}
