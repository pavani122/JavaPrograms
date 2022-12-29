/*24. Using Consumer Interface,print stream of integers ranging
 *  from 1 to 10 and make sure to neglect numbers between 3 and 7.*/
 
package com.techouts.assessment24;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Question24 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
        for (int i=1;i<=10;i++) {
        	list.add(i);
        }
        Consumer<Integer> c=i->System.out.println(i);
        List<Integer> newList = list.stream().filter(x->x<3||x>7).map(x->x).collect(Collectors.toList()); 
		newList.forEach(c);
		
	
        
	}

}
