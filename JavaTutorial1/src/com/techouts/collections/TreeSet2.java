package com.techouts.collections;
import java.util.*;

public class TreeSet2  {

	public static void main(String[] args) {

		TreeSet ts=new TreeSet(new Comperator2());
		ts.add("e");
		ts.add("pavani");
		ts.add("jyo");
		ts.add("durga");
		System.out.println(ts);
	}

}
