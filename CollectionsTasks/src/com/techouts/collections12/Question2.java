/*12 Write a program to serialize an ArrayList in java?*/
package com.techouts.collections12;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Question2 {

	public static void main(String[] args) throws Exception {
		ArrayList<Integer> obj=new ArrayList<>();

		for(int i=1;i<=10;i++)
		{
			obj.add(i);
		}
		File f=new File("ArrayList.txt");
		f.createNewFile();
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream ous = new ObjectOutputStream(fos);
		ous.writeObject(obj);
		ous.close();
		fos.close();
		System.out.println("Success");
	}

}
