package com.techouts.fileStreams;
import java.io.*;
public class OutPutStreamDemo {
	public static void main(String[] args) throws IOException{
		
		String s="This is the OutputStreamDemo.........";
		FileOutputStream fos=new FileOutputStream("abc.txt",true);
		byte[] b=s.getBytes();
		fos.write(b);
		fos.close();
		System.out.println("Success");
		
		
		
	}

}
