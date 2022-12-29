/*Write a program to sort HashMap by value?*/
package com.techouts.collections9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Question9{
	  public static void main(String[] args) {

			HashMap<String,Integer> m=new HashMap<>();
			m.put("pav",2);
			m.put("jyo",55);
			m.put("durga",8);
			m.put("yash",17);
			ArrayList<Map.Entry<String, Integer>> list=new ArrayList<>(m.entrySet());
			System.out.println(list);
			Collections.sort(list, new Comparator<>(){

				@Override
				public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
					
					return o1.getValue().compareTo(o2.getValue());
				}
				
			});
			System.out.println(list);
	  }

}
