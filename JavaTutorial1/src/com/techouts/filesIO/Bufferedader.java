package com.techouts.filesIO;

import java.io.*;;

public class Bufferedader {

	public static void main(String[] args) throws IOException {

		FileReader fr=new FileReader("E:\\JavaTraining\\JavaTutorial1\\newFile.txt");
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		while(line!=null)
		{
			System.out.println(line);
			line=br.readLine();
		}
		br.close();
	}

}
