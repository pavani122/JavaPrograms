package com.techouts.filesIO;

import java.io.FileReader;

public class FileRead {

	public static void main(String[] args) throws Exception {

		try {
		FileReader fr=new FileReader("newFile.txt");
		int data=fr.read();
		while(data!=(-1))
		{
			  System.out.print((char)data);
			  data=fr.read();
		}
		         fr.close(); 
		}
		
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
	}
