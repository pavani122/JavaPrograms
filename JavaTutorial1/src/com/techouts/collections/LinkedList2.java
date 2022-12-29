package com.techouts.collections;
import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {

	LinkedList<String> l1=new LinkedList<>();
 //adding elements
	l1.add("p");
	l1.add("q");
	l1.add("r");
	System.out.println(l1);
// removing elements
	l1.remove();
    System.out.println(l1);
    l1.remove("r");
    System.out.println(l1);
    l1.clear();
    System.out.println(l1);
    l1.add("x");
    l1.add("y");
    l1.add("z");
    System.out.println(l1);
    l1.removeFirst();
    System.out.println(l1);
    l1.removeLast();
    System.out.println(l1);

	}
}
