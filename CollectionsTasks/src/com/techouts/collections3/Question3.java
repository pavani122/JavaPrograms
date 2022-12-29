/* WAP to map multiple countries with their respective capitals using map .
 * Iterating them using
1.foreach loop
2.keyset iterator
3.entryset iterator along with foreach
4.EntrySet along with Java iterator*/

package com.techouts.collections3;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Question3 {

	public static void main(String[] args) {

		Map<String,String> m=new HashMap<>();
		m.put("Telangana", "Hyderabad");
		m.put("Maharastra", "Mumbai");
		m.put("Andhra Pradesh", "Amaravati");
		m.put("Kerala", "Trivandrum	");
		m.put("Tamil Nadu", "Chennai");
		m.put("West Bengal", "Kolkata");
		
		//1.method
		System.out.println("this is first method");
		Set s=m.entrySet();
		for(Map.Entry me:m.entrySet()) 
		{
			System.out.println(me);
		}
		
		//2.method
		System.out.println("this is second method");

		Iterator it=s.iterator(); 
		while(it.hasNext())
		{
			Map.Entry me=(Map.Entry)it.next();
			System.out.println(me.getKey());
		}
		
		//4.method
		System.out.println("this is fourth method");

		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
