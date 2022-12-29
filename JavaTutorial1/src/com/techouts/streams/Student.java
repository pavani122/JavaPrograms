package com.techouts.streams;

import java.util.ArrayList;
import java.util.List;

public class Student {
	String name;
	int age, id;
	
	Student(String name,int age,int id)
	{
	this.name=name;
	this.age=age;
	this.id=id;
	}
	static List<Student>  getStudents() {
		ArrayList<Student> studs=new ArrayList<>();
		studs.add(new Student("meghana",18,13));
		studs.add(new Student("deepika",17,9));
		studs.add(new Student("yashitha",15,3));
		return studs;
		
		
	}

}
