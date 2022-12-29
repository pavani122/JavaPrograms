/*Input:HashMap
{selva:75.6f, abi:89.5f,ram:40}
Output:hashmap
{selva:pass,abi:pass,ram:fail}
If the mark is >60 return the names and their status as pass in a output hashmap else fail
problem statemnt*/

package com.techouts.collections16;
import java.util.*;

public class Question16 {
public static void main(String[] args) {
	

	HashMap<String,Float> hmap=new HashMap<>();
	HashMap<String,String> hmap1=new HashMap<>();

	hmap.put("selva",75.6f);
	hmap.put("abi",89.5f);
	hmap.put("ram",40.0f);
	
	System.out.println(hmap);
	
	//1.method
	Set s=hmap.entrySet();
	Iterator it=s.iterator();
	while(it.hasNext())
	{
		Map.Entry<String,Float> me=(Map.Entry)it.next();
		
		if(me.getValue()>60)
		{
			hmap1.put(me.getKey(),"pass");
		}
		else
		{
			hmap1.put(me.getKey(),"fail");
		}
	}
	System.out.println(hmap1);
	
	//2.method
	
	 for(String m:hmap.keySet()) {
		 if(hmap.get(m)>60) {
			 hmap1.put(m,"pass");
			 
		 }
		 else
		 {
			 hmap1.put(m, "fail");
		 }
	 }
	 System.out.println(hmap1);
	
}
}