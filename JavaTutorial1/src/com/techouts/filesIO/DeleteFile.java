package com.techouts.filesIO;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {

		File f=new File("abc.txt");
		System.out.println(f.exists());

		System.out.println("After deleting file");
		f.delete();
		System.out.println(f.exists());
	}

}
