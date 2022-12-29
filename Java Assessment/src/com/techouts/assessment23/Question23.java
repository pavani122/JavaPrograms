/*23. Perform calculations such as count,sum,min,avg,max 
 * for given input of arrayList using Stream API.*/

package com.techouts.assessment23;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question23 {
	public static void main(String[] args) {

		ArrayList<Integer> list=new ArrayList<>();
		for(int i=1;i<=20;i++)
		{
			list.add(i);
		}
		//1.count
		long count=list.stream().count();
		System.out.println("total elements are:"+count);
		//2.min
		Integer min=list.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("minimum mumber in the list is:"+min);
		//3.max
		Integer max=list.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("minimum mumber in the list is:"+max);
		//4.sum
		float sumOfList=list.stream().map(x->x).reduce( (int) 0.0f,(sum,x)->sum+x);
		System.out.println(sumOfList);
		//5.avg
		Double avgOfList=list.stream().mapToDouble(x->x).average().orElse(0.0);
		System.out.println(avgOfList);
	}

}
