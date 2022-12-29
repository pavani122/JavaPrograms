package com.techouts.streams;
import java.util.*;
import java.util.function.Predicate;

public class AllMatch {

	public static void main(String[] args) {
		
		Predicate<Student> p1=s->s.name.startsWith("p");
		Predicate<Student> p2=s->s.age<=18;
		List<Student> list=Student.getStudents();


		boolean s=list.stream().allMatch(p1);
		boolean s1=list.stream().allMatch(p2);
		System.out.println("All the student name starts with p: "+s);
		System.out.println("All the student age less than 18: "+s1);
		
	}

}
