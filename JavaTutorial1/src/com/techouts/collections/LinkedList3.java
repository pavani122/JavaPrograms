package com.techouts.collections;
import java.util.*;
import java.util.Scanner;

class Author
{
	String name;
	int age;
	String bkNm;
	int bkPrc;
	Author(String name,int age,String bkNm,int bkPrc)
	{
		this.name=name;
		this.age=age;
		this.bkNm=bkNm;
		this.bkPrc=bkPrc;
	}
}
public class LinkedList3 {

	public static void main(String[] args) {
		
		List<Author> l1=new LinkedList<>();
		Author a1=new Author("Mahesh",35,"Old Man",499);
		Author a2=new Author("Ramesh",44,"First Cry",650);
		Author a3=new Author("Kiran",25,"New Monk",349);
		l1.add(a1);
		l1.add(a2);
		l1.add(a3);
		for(Author a:l1)
		{
		System.out.println("Name:"+a.name+"\t"+"Age:"+a.age+"\t"+"Book Name:"+a.bkNm+"\t"+"Book Price:"+a.bkPrc);
		}

	}

}
