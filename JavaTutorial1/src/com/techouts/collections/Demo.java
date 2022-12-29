package com.techouts.collections;
import java.util.*;
import java.util.Map.Entry;
class Student
{
	  String name="aaa";

	@Override
	public String toString() {
		
		return name;
	}
	 
	 
	 
}
class Book
{
  static List<String> addBookDetails()
	{
	List<String> list=new ArrayList<String>();
	list.add("a");
	list.add("b");
	list.add("c");
	return list;

	}
	
}
public class Demo {

	public static void main(String[] args) {

		List<String> list=new ArrayList<String>();
		Student s=new Student();
		list=Book.addBookDetails();
		Map<Student,List<String>> map=new HashMap<Student,List<String>>();
		map.put(s, list);
		System.out.println(map);
		for(Entry<Student, List<String>> me:map.entrySet())
		{
			List<String> values=me.getValue();
			Iterator it=values.iterator();
			while(it.hasNext())
			{
				System.out.println(me.getKey()+":"+it.next());
			}
		}
	}

}
