/*perform followiing operations on array list
a)How to Iterate ArrayList using Java ListIterator
b)Arraylist add element at specific index
c)Sort ArrayList in descending order
d)insert an element to ArrayList using ListIterator
e)Hsort arraylist of strings alphabetically java
f)Sort elements of Java ArrayList
g)replace an element at specified index arraylist
h)Search an element of Java ArrayList
i)Remove element from specified index ArrayList
j)Remove duplicates from arraylist without using collections*/

package com.techouts.collections4;
import java.util.*;

public class Question4a{

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("raghu");
		al.add("vishu");
		al.add("vamshi");
		al.add("ramesh");
		ListIterator ltr=al.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		al.add(1, "ravi");
		System.out.println("after adding element at specific index arraylist is:");
		ListIterator ltr1=al.listIterator();
		while(ltr1.hasNext())
		{
			System.out.println(ltr1.next());
		}
		
		System.out.println("retrieving elements in descending order");
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		System.out.println("inserting element using listIterator into arraylist");
		ListIterator ltr2=al.listIterator();
		while(ltr2.hasNext())
		{	
			String l=(String)ltr2.next();
			if(l.equals("raghu"))
			{
				ltr2.add("suresh");
			}
		}
		System.out.println(al);
		
		System.out.println("sorting elements of arraylist");
		Collections.sort(al);
		System.out.println(al);
		
		System.out.println("replacing an element with the specified element");
		al.set(1, "ramu");
		System.out.println(al);
		
		System.out.println("searching an element in the arraylist ");
		System.out.println("the index of element raghu is: "+al.indexOf("raghu"));
		
		System.out.println("removing an element at specified index in the arraylist ");
		al.remove(5);
		System.out.println("after remving the element the arraylist is "+al);

	}

}
