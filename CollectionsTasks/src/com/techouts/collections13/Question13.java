/*How to synchronize an ArrayList in java?*/
package com.techouts.collections13;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Question13 extends Thread {

  public void run()
	{
	
	}
	public static void main(String[] args) {

		List<Integer> al1=Collections.synchronizedList(new ArrayList<Integer>());
		for(int i=1;i<=10;i++)
		{
			al1.add(i);
		}
		synchronized(al1)
		{
			Iterator<Integer> it=al1.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}
	}

}
