/* Employee has methods for create, read and write to a file.
 * Manager extends employer and have these file methods overriden
 * (Examine here without handling the exceptions) along with delete the file.*/

package com.techouts.filesTasks;

import java.io.File;
import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) throws Exception {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee name:");
		String name=sc.next();
		System.out.println("Enter employee startyear:");
		int strtYear=sc.nextInt();
		System.out.println("Enter employee rating:");
		float rating=sc.nextFloat();
		Manager m=new Manager();
		File f=m.create();
		m.write(name,strtYear,rating);
		m.read(f);
	}

}
