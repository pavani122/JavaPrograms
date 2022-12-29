/* In an array of 1-10, multiple numbers are duplicates,
 *  how do you find duplicates using Map implemented classes.*/
package com.techouts.assessment7;
import java.util.*;
import java.util.Map.Entry;

public class Question7 {

	public static void main(String[] args) {

		Integer arr[]= {1,2,2,3,4,5,5,6,6,7,8,8,8,9,10};
		HashMap<Integer, Integer> map=new HashMap();
		map.put(1,1);
		map.put(2,2);
		map.put(3,1);
		map.put(4,1);
		map.put(5,2);
		map.put(6,2);
		map.put(7,1);
		map.put(8,3);
		map.put(9,1);
		map.put(10,1);
		Set s=map.entrySet();
		Iterator it=s.iterator();
		System.out.println("Duplicate Keys are:");
		while(it.hasNext())
		{
			Map.Entry<Integer, Integer> me=(Entry<Integer, Integer>) it.next();
		    if(me.getValue()>1)
		    {
		    	System.out.println(me.getKey());
		    }
			
		}
		

		
	}

}
