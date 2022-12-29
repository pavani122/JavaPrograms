package com.techouts.map;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class MapDemo1 {

	public static void main(String[] args) {

		//creation of hashmap
		Map m=new HashMap(); //default constructor
		m.put(1,"pavani");
		m.put(2, "jyothika");
		m.put(3,"durga");
		m.put(4, "yashu");
		System.out.println(m);
		System.out.println(m.size());
		
		System.out.println(m.put(1,"pav"));
		System.out.println(m);
		
		Map m1=new HashMap(2);
		m1.put(11,"aa");
		m1.put(11,"aa");
		m1.put(11,"aa");
		System.out.println(m1);
		System.out.println(m1.size());

		Map m2=new HashMap(2,0.05f);
		m2.put(11,"ab");
		m2.put(2,"ab");
		System.out.println(m2);
		System.out.println(m2.size());
		
		Iterator it=m.keySet().iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		Iterator it1=m.values().iterator();
		while(it1.hasNext())
		{
			System.out.println(it1
					.next());
		}



	}

}
