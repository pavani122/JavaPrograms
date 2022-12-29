package com.techouts.map;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<String,String> m=new HashMap<>();
		//adding elements into the map
		m.put("Pavani","pav");
		m.put("Jyothika","jyo");
		m.put("Sai durga", "durga");
		m.put("Yashashwini", "yash");
		System.out.println("first map object: "+m);
		
		//adding all elements into another map object
		HashMap<String,String> m1=new HashMap<>();
		m1.putAll(m);
		System.out.println("second map object: "+m1);

		//getkey() method
		System.out.println(m1.get("Pavani"));
		//getValue() method
	    m1.remove("Pavani");
	    System.out.println("after removing a key: "+m1);
	    //contains()
	    System.out.println(m1.containsKey("Yashashwini"));
	    System.out.println(m1.containsValue("pav"));
	    //size()
	    System.out.println(m1.size());
	    System.out.println(m.size());

	    System.out.println("iterating using iterator");
	    //iterating using iterator
	    Set s=m.entrySet();
	    Iterator it=s.iterator();
	    while(it.hasNext())
	    {
	    	System.out.println(it.next());
	    }
	    
	    System.out.println("iterating using for-each loop");
	    //iterating using for-each loop
	    for(Map.Entry me:m.entrySet())
	    {
	    	System.out.println(me.getKey()+":"+me.getValue());
	    }
	    
	    //remving all the elements from map
	    System.out.println("after remving all the elements from map object");
	    m1.clear();
	    System.out.println(m1);
	    System.out.println("is second map object is empty: "+m1.isEmpty());
		
	}

}
