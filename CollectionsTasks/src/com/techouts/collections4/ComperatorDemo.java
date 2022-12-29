package com.techouts.collections4;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

public class ComperatorDemo implements Comparator {

	public int compare(Object obj1,Object obj2) {
		String s1=(String)obj1;
		String s2=(String)obj2;
		return s2.compareTo(s1);
		
	}
}