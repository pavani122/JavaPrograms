package com.techouts.collections11;
import java.util.*;
import java.util.Collections;

public class Question11 {

	public static void main(String[] args) {

		Map<Integer,String> map=Collections.synchronizedMap(new HashMap());
		for(int i=1;i<=5;i++)
		{
			map.put(i, "a");
		}
		
		synchronized(map)
		{
			Set s=map.entrySet();
			Iterator it=s.iterator();
			while(it.hasNext())
			{
				Map.Entry<Integer, String> me=(Map.Entry<Integer, String>)it.next();
				System.out.println(me.getKey()+":"+me.getValue());
			}
		}
	}

}
