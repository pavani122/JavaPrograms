package com.techouts.fileStreams;
import java.io.*;
import java.util.zip.*;
public class CompressFileGZip {

	public static void main(String[] args) {
		
	String source_file = "E:\\JavaTraining\\JavaTutorial1\\abc.txt";
	String destination_file = "E:\\JavaTraining\\JavaTutorial1\\abc.gzip";
	
	CompressFileGZip obj=new CompressFileGZip();
	obj.compress(source_file,destination_file);
}

	public void compress(String source_file, String destination_file) {
		
		byte[] buffer=new byte[1000];
		
		try {
			GZIPOutputStream gZip=new GZIPOutputStream(new FileOutputStream(destination_file));
			FileInputStream fis=new FileInputStream(source_file);
			int len;
			while((len=fis.read(buffer))>0)
			{
				gZip.write(buffer,0, len);
			}
			fis.close();
			gZip.finish();
			gZip.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Success");
		
	}
}