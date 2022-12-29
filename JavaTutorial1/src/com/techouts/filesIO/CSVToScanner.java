package com.techouts.filesIO;
import java.io.*;
import java.util.Scanner;

public class CSVToScanner {

	public static void main(String[] args) throws Exception {

		String file="E:\\JavaTraining\\scanner.csv";
		CSVToScanner obj=new CSVToScanner();
		obj.readScanner(file);
		obj.readBufferReader(file);
	}

	public  void readScanner(String file) {	
		try {
			Scanner sc=new Scanner(new File(file));
			while(sc.hasNext())
			{
				System.out.println(sc.next().toString());
			}
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
	private void readBufferReader(String file) throws Exception {
		String line="";
		try {
			BufferedReader br=new BufferedReader(new FileReader(file));
			line=br.readLine();
			while(br!=null)
			{
				System.out.println(br.toString());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
