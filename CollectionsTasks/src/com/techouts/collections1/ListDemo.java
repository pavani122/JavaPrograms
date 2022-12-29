package com.techouts.collections1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

   void list() 
	{
		
	List<String> list=new ArrayList();
//	list.add(1);
//	list.add(32);
//	list.add(3);
//	list.add(8);
//	list.add(95);
//	
//	List<Integer> list1=Collections.unmodifiableList(list);
	System.out.println("Read-only list \n"+ list.get(0));
	
	}

}
