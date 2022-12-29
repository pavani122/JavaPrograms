package com.techouts.filesIO;

import java.io.File;

//public class ListFile {
//
//	public static void main(String[] args) throws Exception{

//		int count=0;
//		File f=new File("E:\\JavaTraining");
//		String[] s=f.list();
//		for(String s1:s)
//		{
//			//File f1=new File(f,s1);
//			//if(f1.isDirectory())
//			count++;
//			System.out.println(s1);
//		}
//		System.out.println("The number of files in E:\\javatutorial is: "+count);
		
		public class Task {
		    public static void listFilesForFolder(final File folder) {
		    	int count=0;
		        for (final File fileEntry : folder.listFiles()) {
		            if (fileEntry.isDirectory()) {
		                listFilesForFolder(fileEntry);
		            } else {
		            	count++;
		                System.out.println(fileEntry.getName());
		            }
		        }
		        System.out.println("The number of files in E:\\javatutorial is: "+count);
		    }
		    public static void main(String[] args) {

		        final File folder = new File("E:\\JavaTraining");
		        listFilesForFolder(folder);

		    
	}

}
