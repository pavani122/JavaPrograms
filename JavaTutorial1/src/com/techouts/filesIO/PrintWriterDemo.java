package com.techouts.filesIO;

import java.io.*;

public class PrintWriterDemo {

	public static void main(String[] args) throws Exception {

		FileWriter fw=new FileWriter("newFile.txt",true);
		PrintWriter pw=new PrintWriter(fw);
		pw.print(true);
		pw.println(55);
		pw.println(4.4f);
		char c='a';
		pw.println(c);
		pw.println("This is PrintWriterDemo");
		pw.close();
		
		System.out.println("successfully wrote the data intlo the file");
		
	}

}
