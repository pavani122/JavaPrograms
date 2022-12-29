package com.techouts.map;
import java.util.*;

public class TreeMapDemo {

	public static void main(String[] args) {

		TreeMap tmap=new TreeMap();
		System.out.println("elements of treemap");
		tmap.put(1, "Data1");
		tmap.put(23, "Data2");
		tmap.put(70, "Data3");
		tmap.put(4, "Data4");
		tmap.put(2, "Data5");
		System.out.println(tmap);


		//adding the elements from hashmap to treemap
		System.out.println("adding the elements from hashmap to treemap");
		HashMap hmap=new HashMap(tmap);
		System.out.println(hmap);

		//adding the elements from treemap to hashmap
		System.out.println("adding the elements from treemap to hashmap");
		TreeMap tmap1=new TreeMap(hmap);
		System.out.println(tmap1);


	}

}
