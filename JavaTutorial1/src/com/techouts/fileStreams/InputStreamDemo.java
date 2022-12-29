package com.techouts.fileStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamDemo {

	public static void main(String[] args) throws IOException {

		byte[] array=new byte[100];
		FileInputStream fis=new FileInputStream("abc.txt");
		System.out.println("total bytes: "+fis.available());
		fis.read(array);
		
		//converting bytes to string
		String data=new String(array);
		System.out.println(data);
		fis.close();
	}

}
