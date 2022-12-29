package com.techouts.assessment18;
import java.util.*;

public class Question18  {
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		Employee emp1=new Employee(11,"pavani",4.3f,2022);
		Employee emp2=new Employee(2,"soma",4.6f,2022);
		Employee emp3=new Employee(45,"priyanka",4.5f,2022);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		Collections.sort(list,new StartYearComparator());
		Collections.sort(list,new RatingComparator());
		
		for (Employee s:list) {
			System.out.println(s.id+" "+s.name+" "+s.rating+" "+s.strtYear);
		}
		
	
		
		
	}

}
