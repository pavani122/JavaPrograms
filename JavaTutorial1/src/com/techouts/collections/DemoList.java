package com.techouts.collections;
import java.util.*;
class Student1
{
	String name;
	int age;
	Student1(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
}
class Book1
{
	String bookName;
	int price;
	Book1(String bookName,int price)
	{
		this.bookName=bookName;
		this.price=price;
	}
}
public class DemoList {

	public static void main(String[] args) {

		Student1 s1=new Student1("yashu",20);
		Student1 s2=new Student1("jyothika",22);
        Book1 b1=new Book1("meluha",500);
        Book1 b2=new Book1("immortals",1300);
        ArrayList<Book1> list=new ArrayList<Book1>();
        list.add(b1.bookName);
        list.add(b2.bookName);
		Map<Student1,List<Book1>> map=new HashMap<Student1,List<Book1>>();
		map.put(s1.name, list);
		map.put(s2.name, list);
        System.out.println(map);
	}

}
