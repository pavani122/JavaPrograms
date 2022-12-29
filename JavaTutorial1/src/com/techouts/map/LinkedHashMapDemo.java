package com.techouts.map;
import java.util.*;

public class LinkedHashMapDemo { 
	public static void main(String[] args) {
		
	
	
	Map<String,String> m=new LinkedHashMap<>();
	m.put("a","apple");
	m.put("b", "ball");
	m.put("c","cat");
	m.put("d", "dog");
	m.put("e", "egg");
	System.out.println(m);
	//to iterate map we need to use set
	
	Set s=m.entrySet();
	Iterator it=s.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
//		Map.Entry me=(Map.Entry)it.next();
//		System.out.println(me.getKey()+":"+me.getValue());


	}
	
	}

}
