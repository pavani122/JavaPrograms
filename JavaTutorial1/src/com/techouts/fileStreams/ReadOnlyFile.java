package com.techouts.fileStreams;
import java.io.*;

public class ReadOnlyFile {

	public static void main(String[] args) {

		try {
		File f=new File("readonly.txt");
		f.createNewFile();
		boolean a=f.setReadOnly();
		System.out.println("Is this file readonly: "+a);
		System.out.println("Can write anything to that file: "+f.canWrite());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
