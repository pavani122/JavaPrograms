package com.techouts.filesIO;

import java.io.*;

public class BufferedWriterDemo {

	public static void main(String[] args) throws Exception {
		
		FileWriter fw=new FileWriter("newFile.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(677);
		bw.newLine();
		bw.write("BufferedWriter file");
		bw.newLine();
		char[] ch= {'a','b','c','d','e'};
		bw.write(ch);
		bw.flush();
		bw.close();
		System.out.println("successfully wrote");
        
		
	}

}
