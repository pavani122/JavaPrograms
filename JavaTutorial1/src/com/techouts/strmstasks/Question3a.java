/*a).what is funtional interface ? Give an example*/
package com.techouts.strmstasks;

import java.util.Scanner;

interface FunctionalInter1
{
	void stud(String name,int id,int age);
	
	static void ageStud(float marks)
	{
		System.out.println("Marks:"+marks);
	}
}
public class Question3a {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the student");
		String NAME=sc.next();
		System.out.println("Enter the id of the student");
		int ID=sc.nextInt();
		System.out.println("Enter the age of the student");
		int AGE=sc.nextInt();
		System.out.println("Enter the marks of the student");
		float MARKS=sc.nextFloat();
		
		FunctionalInter1 fi= (name,id,age)->System.out.println("Name:"+name+"\nId:"+id+"\nAge:"+age);
		fi.stud(NAME, ID, AGE);
		FunctionalInter1.ageStud(MARKS);

		
	}

}
