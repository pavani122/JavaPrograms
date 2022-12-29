/*Methods of Iterator:hasNext(),next(),remove()
Methods of ListIterator:add(E e),hasNext(),hasPrevious(),next()
,nextIndex(),previous(),previousIndex(),remove(),set(E e)*/

package com.techouts.assessment20;
import java.util.*;

public class Question20 {

	public static void main(String[] args) {

		ArrayList<Integer> list=new ArrayList<>();
		for(int i=1;i<=10;i++)
		{
			list.add(i);
		}
		//iterator()
		System.out.println("using iterator");
		Iterator<Integer> it=list.iterator();
		while(it.hasNext())
		{
			if(it.next()==1)
				it.remove();
			System.out.println(it.next());
			
		}
		
		//listIterator
		System.out.println("using listIterator");
		ListIterator lit=list.listIterator();
		while(lit.hasNext())
		{
			if(lit.equals(1))
				lit.add(10);
			else if(lit.equals(2))
				lit.remove();
			System.out.println(lit.next());
		}
		
		while(lit.hasPrevious())
		{
			System.out.println(lit.previousIndex()+"..."+lit.previous());
				
		}
	}

}
