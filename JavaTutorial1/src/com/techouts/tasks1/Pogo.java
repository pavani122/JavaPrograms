package com.techouts.tasks1;

import java.util.ArrayList;
import java.util.Scanner;

class Pogo {
	String empName;
	int empId;
	String empAdd;
	Pogo(String empName,int empId,String empAdd)
	{
		this.empName=empName;
		this.empId=empId;
		this.empAdd=empAdd;
	}	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Pogo pogo1=new Pogo("Pavani", 1, "Hydb");
		Pogo pogo2=new Pogo("yassss",2,"Hydb");
		ArrayList<Pogo> arraylist=new ArrayList<Pogo>();
		arraylist.add(pogo2);
		arraylist.add(pogo1);

		boolean b=false;

		System.out.println("Enter id:");
		int value=sc.nextInt();
		for(Pogo p:arraylist) {
			if(p.empId==value) {
				b=true;
			}
		}
		try {
			if(b) {
				System.out.println("Welcome");
			}
			else {
				throw new Exception("Invalid id");
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}



