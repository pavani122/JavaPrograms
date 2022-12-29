package com.techouts.collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Vector2 {

	public static void main(String[] args) {

		Vector v1=new Vector();
		v1.add("pav");
		v1.add("jyo");
		v1.add("durga");
		System.out.println(v1);
		v1.addElement("yash");
		v1.add("xyz");
		System.out.println(v1);
		System.out.println(v1.contains("pav"));
		System.out.println(v1.remove("xyz"));
		System.out.println(v1);
		//creation of another vector
		Vector v2=new Vector();
		v2.addAll(v1);
		System.out.println("vector 2:" +v2);
		v1.clear();
		System.out.println(v1);
		System.out.println(v1.isEmpty());
		System.out.println("index: "+v2.get(3));
		//creation of arraylist
		ArrayList a=new ArrayList();
		a.addAll(v2); //adding all the elements from vector to arraylist
		System.out.println("arraylist: "+a);
		LinkedList l=new LinkedList();
		l.addAll(a); //adding all the elements from arraylist to linkedlist
		System.out.println("linkedlist: "+l);
	}

}
