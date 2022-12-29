package com.techouts.fileStreams;

import java.io.File;

public class FileIsHidden {

	public static void main(String[] args) {

		File f=new File("E:\\JavaTraining\\JavaTutorial1\\123.txt");
		boolean b=f.isHidden();
		System.out.println("is file hidden: "+b);
	}

}
