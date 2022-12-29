package com.techouts.map;
import java.util.TreeMap;

public class TreeMapDemo2 {

	public static void main(String[] args) {

		TreeMap t1=new TreeMap();
		t1.put("Key1", "Jack");
	    t1.put("Key49", "Rick");
	    t1.put("Key3", "Kate");
	    t1.put("Key40", "Tom");
	    t1.put("Key5", "Steve");
	    System.out.println(t1);
	    
	   //first key
	   System.out.println(t1.firstKey());
	   //last key
	   System.out.println(t1.lastKey());
	   //head and tail key
	   System.out.println(t1.headMap("Key3"));
	   System.out.println(t1.tailMap("Key3"));
       //subMap
	   System.out.println(t1.subMap("Key1","Key40"));
	   //comperator
	   System.out.println(t1.comparator());

	}

}
