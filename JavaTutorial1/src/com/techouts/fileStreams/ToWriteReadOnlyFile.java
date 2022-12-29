package com.techouts.fileStreams;
import java.io.*;
public class ToWriteReadOnlyFile {

	public static void main(String[] args) throws Exception {

		FileOutputStream fos;
		try {
		fos = new FileOutputStream("E:\\JavaTraining\\JavaTutorial1\\readonly.txt");	
		String s="Writing to readonly file";
		byte[] b=s.getBytes();
		fos.write(b);
		fos.close();
		}
		catch (FileNotFoundException e)
		{
        System.out.println(e);		
        }
		System.out.println("Success");
		
	}

}
