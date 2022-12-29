package com.techouts.map;

import java.util.*;

public class TreeMapDemo3 {

	public static void main(String[] args) {

		 TreeMap<Integer, String> hmap = new TreeMap<Integer, String>();

		 System.out.println("default sorting");
	      hmap.put(12, "Chaitanya");
	      hmap.put(2, "Rahul");
	      hmap.put(7, "Singh");
	      hmap.put(49, "Ajeet");
	      hmap.put(3, "Anuj");
	      System.out.println(hmap);
	      
	      System.out.println("customized sorting");
	      TreeMap tm=new TreeMap(new MyComp());
	      tm.put(12, "Chaitanya");
	      tm.put(2, "Rahul");
	      tm.put(7, "Singh");
	      tm.put(49, "Ajeet");
	      tm.put(3, "Anuj");
	      System.out.println(tm);
	}

}
