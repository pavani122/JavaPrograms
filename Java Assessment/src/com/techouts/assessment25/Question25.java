/*25. Using Consumer Interface,print stream of integers ranging from 1 to 10 
 and double these numbers in your output.*/

package com.techouts.assessment25;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Question25 {
	public static void main(String[] args) {

		List<Integer> list=new ArrayList<>();
		for(int i=1;i<=10;i++)
		{
			list.add(i);
		}
        Consumer<Integer> c=i->System.out.println(i);
		List<Integer> newlist=list.stream().map(i->(i*i)).collect(Collectors.toList());
        newlist.forEach(c);
	}

}
