package com.techouts.fileStreams;
import java.io.*;
public class CopyFiles {

	public static void main(String[] args) {

		String file1="E:\\JavaTraining\\JavaTutorial1\\abc.txt";
		String file2="E:\\JavaTraining\\JavaTutorial1\\newFile.txt";
		CopyFiles obj=new CopyFiles();
		obj.copy(file1,file2);
		
		
	}

	public void copy(String file1, String file2) {	
		
		byte[] buffer=new byte[1000];
		try {
		FileInputStream fis=new FileInputStream(file1);
		FileOutputStream fos= new FileOutputStream(file2,true);
		int len;
		while((len=fis.read(buffer))>0)
		{
			fos.write(buffer,0, len);
		}
	fis.close();
	fos.flush();
	fos.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("success");
	}

}
