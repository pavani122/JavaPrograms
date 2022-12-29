package com.techouts.collections;
import java.util.*;

public class ArrayList3 {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		al.add("apple");
		al.add("ball");
		al.add("cat");
		System.out.println(al);
		ListIterator li=al.listIterator();
		while(li.hasNext())
		{
			String l=(String)li.next();
			if(l.equals("apple"))
			{
				li.remove();
			}
			if(l.equals("ball"))
			{
				li.set("bat");
			}
			if(l.equals("cat"))
			{
				li.add("dog");
			}
		}
		System.out.println(al);
		while(li.hasPrevious())
		{
			String s=(String)li.previous();
			if(s.equals("apple"))
			{
				li.remove();
			}
			if(s.equals("ball"))
			{
				li.set("bat");
			}
			if(s.equals("cat"))
			{
				li.add("dog");
			}
		}
		System.out.println(al);
		
	}

}
