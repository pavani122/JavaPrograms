package com.techouts.collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vector3 {

	public static void main(String[] args) {

		Vector v=new Vector();
		v.add(4);
		v.add(5);
		v.add(6);
		System.out.println("enumeration");
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		System.out.println("iterator");
		Iterator i=v.iterator();
		while(i.hasNext())
		{
			Integer I=(Integer)i.next();
			if(I%2==0)
			{
			System.out.println(I);
			}
			else
			{
				i.remove();
			}
			
		}
		System.out.println(v);
	}

}
