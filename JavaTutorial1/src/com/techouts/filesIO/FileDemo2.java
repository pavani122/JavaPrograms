package com.techouts.filesIO;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) throws Exception {

		File f=new File("E:\\FileIO","abc.txt");
		f.createNewFile();
		System.out.println(f.exists());
	}

}
