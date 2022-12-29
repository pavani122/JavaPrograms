package com.techouts.filesTasks;
import java.io.*;
import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee name:");
		String empName=sc.nextLine();
		System.out.println("Enter employee role:");
		String empRole=sc.nextLine();
		System.out.println("Enter employee id:");
		int empId=sc.nextInt();
		
		
		Employee obj=new Employee(empRole, empId, empRole);
		try
		{
		File f=new File("employee.txt");
		f.createNewFile();
		PrintWriter p=new PrintWriter(f);
		p.println(empName);
		p.println(empId);
		p.println(empRole);
		System.out.println(f.getAbsolutePath());

		//boolean a=f.setReadOnly();

		p.close();
		}
		
		catch(Exception e) 
		{
		System.out.println(e);
		}
	System.out.println("Successfully wrote the employee details");	
}
}
