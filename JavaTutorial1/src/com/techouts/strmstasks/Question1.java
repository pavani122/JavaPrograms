/* What are the Terminal operations? give an example for 
 * 1.collect() 2.reduce() 3. anyMatch() , noneMatch() , allMatch() 
 * 4. forEach() 5.forEachOrdered()*/

package com.techouts.strmstasks;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Question1 {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList();
		for(int i=1000;i>=1;i--)
		{
			list.add(i);
		}
		//collect()
		System.out.println("collect()");
		List<Integer> listCollect=list.stream().filter(i->i%125==0).collect(Collectors.toList());
		listCollect.stream().forEach(i->System.out.println(i));
		System.out.println("------------------------------------");
		//reduce() 
		System.out.println("after use of reduce method on stream of elements collected by collect()");
		Optional<Integer> reduce=listCollect.stream().reduce((a,b)->a-b);
		if(reduce.isPresent())
		{
			System.out.println(reduce.get());
		}
		System.out.println("------------------------------------");
		//anyMatch
		boolean result1=listCollect.stream().allMatch(i->i==125 && i==250);
		System.out.println("(AllMatch)all the elements are equal to 125 && 250 :"+result1);
		System.out.println("------------------------------------");
		//anyMatch
		boolean result2=listCollect.stream().anyMatch(i->i==125 && i==250);
		System.out.println("(ANYMATCH)any of the elements are equal to 125 && 250 :"+result2);
		System.out.println("------------------------------------");
		//noneMatch
	    boolean result3=listCollect.stream().noneMatch(i->i==125 && i==250);
		System.out.println("(NOMATCH)none of the elements are equal to 125 && 250 :"+result3);
		System.out.println("------------------------------------");
		//forEach
		System.out.println("printing elements using for-each");
		listCollect.stream().forEach(System.out::println);
		System.out.println("------------------------------------");
		//forEachOrdered
		System.out.println("printing elements using foreachOrdered");
		listCollect.stream().parallel().forEachOrdered(System.out::println);
	}

}
