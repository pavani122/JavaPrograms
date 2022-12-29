/* Using TreeSet, make sure to add varied data types to the set 
 * including Upper and Lower case and predict your output.*/
package com.techouts.assessment8;
import java.util.*;
public class Question8 {

	public static void main(String[] args) {

		TreeSet set=new TreeSet();
		set.add(5);
		set.add("java");
		set.add(4.5f);
		set.add(2.22);
		set.add("Java");
		set.add("JAVA");
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
