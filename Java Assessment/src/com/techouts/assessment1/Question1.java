/*Implement one-many association for Company and Employee.(Make sure to have rating,startYear for Employee)*/
package com.techouts.assessment1;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Employee e=new Employee();
		Company c=new Company();
		
		System.out.println("Enter employee name, id, age");
		String name=sc.nextLine();
		int id=sc.nextInt();
		int age=sc.nextInt();
		System.out.println("Enter the role and startyear of the employee");
		String role=sc.next();
		int strtYear=sc.nextInt();
		System.out.println("Employee rating:");
		float rating=sc.nextFloat();
		e.setName(name);e.setId(id);e.setAge(age);c.setRole(role);c.setStrtYear(strtYear);c.setRating(rating);
		System.out.println("Name:"+e.getName()+"\tId:"+e.getId()+"  \tAge:"+e.getAge());
		System.out.println("Role:"+c.getRole()+"\tStartYear:"+c.getStrtYear());
		System.out.println("Rating for employee is: "+c.getRating());
	}

}
