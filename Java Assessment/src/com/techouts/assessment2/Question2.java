/*Implement many-many association for Trainee and StudyMaterial.*/
package com.techouts.assessment2;
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Student s=new Student();
		StudyMaterial sm=new StudyMaterial();
		
		System.out.println("Enter student name and id:");
		String name=sc.next();
		int id=sc.nextInt();
		System.out.println("Enter the bookname and authorname:");
		String bookName=sc.next();
		String authorName=sc.next();
		System.out.println("Enter price:");
		int price=sc.nextInt();
		s.setName(name);s.setId(id);sm.setBookName(bookName);sm.setAuthorName(authorName);sm.setPrice(price);
		System.out.println("Name:"+s.getName()+"\tId:"+s.getId());
		System.out.println("BookName:"+sm.getBookName()+"\tAuthorName:"+sm.getAuthorName());
		System.out.println("Price:"+sm.getPrice());

	}

}
