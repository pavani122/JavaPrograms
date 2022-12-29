package com.techouts.collections1;
import java.util.*;

public class MapDemo {

	void map()
	{
		
		Map<Integer,Integer> map=new HashMap();
		map.put(1,1);
		map.put(2,2);
		map.put(3,3);
		map.put(4,4);
		map.put(5,5);
		
		
		Map<Integer,Integer> map1=Collections.unmodifiableMap(map);
		System.out.println("Read-only map \n"+ map1);
		
		}

}
