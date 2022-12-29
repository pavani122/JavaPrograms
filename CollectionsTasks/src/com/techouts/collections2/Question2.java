/*WAP to Convert an Array to ArrayList in Java .Use three ways for conversion and its vice versa.*/

package com.techouts.collections2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question2 {

	public static void main(String[] args) {

   //creation of array
     Integer arr[]={1,2,3,4,5};
    System.out.println("conversion of array to arraylist");
     //first method 
	List<Integer> al=new ArrayList<>();
	Collections.addAll(al, arr);
	System.out.println("first method");
	System.out.println(al);
	
	//second method
    List<Integer> al1 =Arrays.asList(arr);	
    System.out.println("second method");
    System.out.println(al1);
	
	//third method
	List<Integer> al2=new ArrayList<>();
	for(Integer b:arr)
	{
		al2.add(b);
	}
	System.out.println("third method");
	System.out.println(al2);
		
	}

}
