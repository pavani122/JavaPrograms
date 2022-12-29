package com.techouts.collections;
import java.util.*;
import com.techouts.collections.*;

public class LinkedHashSet2 {

	public static void main(String[] args) {
		//creation of arraylist
		List al=new ArrayList<>();	
		al.add("a");
		al.add("a");
		al.add("a");
		al.add("a");
		System.out.println("arraylist: "+al);
		
		
        //creation of linkedhashset
		LinkedHashSet lh=new LinkedHashSet(al);
		System.out.println("linkedhashset: "+lh);
		
		//conversion of linkedhashset to arraylist
		List al1=new ArrayList<>(lh);	
		System.out.println(al1);
		
	    
  
	   
	    
	}

}
