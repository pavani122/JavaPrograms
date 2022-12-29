/* Write a program to iterate TreeMap in java?*/
package com.techouts.collections8;
import java.util.*;

public class Question8 {

	public static void main(String[] args) {

		TreeMap<String,String> m=new TreeMap<>();
		m.put("Pavani","pav");
		m.put("Jyothika","jyo");
		m.put("Sai durga", "durga");
		m.put("Yashashwini", "yash");
		
		System.out.println("iterating elements of treemap");
		Set s=m.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
