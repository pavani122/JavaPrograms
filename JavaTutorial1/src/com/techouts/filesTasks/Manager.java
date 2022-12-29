package com.techouts.filesTasks;

import java.io.*;

public class Manager extends Employer{
    
    public void read(File f) throws Exception 
    {
    	FileReader fr=new FileReader("newEmpl.txt");
    	int data=fr.read();
		while(data!=(-1))
		{
			  System.out.print((char)data);
			  data=fr.read();
		}
		         fr.close(); 
		         System.out.println("successfully read the manager file");
		}
   
     public void write(String name,int startYear,float rating) throws Exception
    {
		FileWriter fw=new FileWriter(f,true);
    	PrintWriter pw=new PrintWriter(fw);
    	pw.println(name);
    	pw.println(rating);
    	pw.println(startYear);
    	System.out.println("successfully wrote into the manager file");
    	pw.close();
    	fw.close();
    }
    
    
    }
    
