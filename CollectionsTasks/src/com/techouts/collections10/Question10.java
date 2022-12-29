/* Write a program toserialize a HashMap in java?*/

package com.techouts.collections10;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class Question10 {
	public static void main(String[] args) throws Exception {

		HashMap<String,String> m=new HashMap<>();
		m.put("Pavani","pav");
		m.put("Jyothika","jyo");
		m.put("Sai durga", "durga");
		m.put("Yashashwini", "yash");
		
		File f=new File("Hashmap.txt");
		f.createNewFile();
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream ous = new ObjectOutputStream(fos);
		ous.writeObject(m);
		ous.close();
		fos.close();
		System.out.println("Success");
	}

}
