package com.techouts.collections1;
import java.util.*;

public class SetDemo {

	
	void set() {
		
		Set<Integer> set=new HashSet();
		set.add(1);
		set.add(32);
		set.add(3);
		set.add(8);
		set.add(95);
		
		Set<Integer> set1=Collections.unmodifiableSet(set);
		System.out.println("Read-only set \n"+set1);
		
		}

}
