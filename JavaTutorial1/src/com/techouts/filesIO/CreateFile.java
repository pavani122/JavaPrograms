package com.techouts.filesIO;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {

		File f=new File("abc.txt");
		System.out.println(f.exists());
		
		//creation of file
		f.createNewFile();
		System.out.println(f.exists());

		//directory
		File d=new File("dirct1");
		System.out.println(d.exists());
		
		//creation of directory
		d.mkdir();
		System.out.println(d.exists());
		
		//constructor with dirname and filename
		File d1=new File("dirct1","newFile.txt");
		d1.createNewFile();
		System.out.println(d1.exists());

	}

}
