package com.techouts.collections;

import java.util.Comparator;
import java.util.TreeSet;


public class TreeSet1 {

	 
	public static void main(String[] args) {

		TreeSet t= new TreeSet(new Comperator1());
		t.add(0);
		t.add(8);
		t.add(16);
		t.add(2);
		t.add(90);
		System.out.println(t);
	}

}
