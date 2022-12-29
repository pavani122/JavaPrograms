package com.techouts.collections;
import java.util.*;

public class HashSet1 {

	public static void main(String[] args) {


		HashSet h=new HashSet();
		HashSet h1=new HashSet(10);
		HashSet h2=new HashSet(5,0.50f);
		h.add(2);
		h1.add(2);
		h1.add("p");
		h2.add("p");
		System.out.println(h2.add("p"));
		System.out.println("hashset default"+h);
		System.out.println("hashset with initial capacity"+h1);
		System.out.println("hashset with capacity and loadfactor"+h2);
	
	}

}
