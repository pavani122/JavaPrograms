package com.techouts.filesIO;

import java.io.FileWriter;

public class FileWrite {

	public static void main(String[] args) {

		try
		{
		FileWriter fw=new FileWriter("newFile.txt");
		fw.write("This is abc text file ");
		fw.write("no it is a newFile");
		fw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("successfully wrote into the file");
		
	}

}
