package com.techouts.filesTasks;
import java.io.*;

public class Employer {
	
	File f=new File("newEmpl.txt");
	
    public File create() throws Exception
    {
    	f.createNewFile();
    	return f;
    }
    
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
		         System.out.println("successfully read the employer file");
		}
    	
    public void write(String name,int startYear,float rating) throws Exception
    {
		FileWriter fw=new FileWriter("newEmpl.txt",true);
    	PrintWriter pw=new PrintWriter(fw);
    	pw.println(name);
    	pw.println(rating);
    	pw.println(startYear);
    	System.out.println("successfully wrote into the employer file");
    	pw.close();
    	fw.close();
    }
    

}
