package com.techouts.tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
	String name,addr;int id;
	public Employee(String name,String addr,int id) {
		this.name=name;
		this.addr=addr;
		this.id=id;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee emp=new Employee("Pavani","Hydb",1);
		Employee emp1=new Employee("Manikanta","Hydb",2);
		ArrayList<Employee> employee=new ArrayList<Employee>();
		employee.add(emp);
		employee.add(emp1);
		try { 
			System.out.println("Enter id :");
			int idd=sc.nextInt();
			for(Employee e:employee) {
				if(e.id==idd) {
					System.out.println("Welcome");
					break;
				}
				else {
					throw new Exception("Invalid");
				}
			}
		}
	
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
