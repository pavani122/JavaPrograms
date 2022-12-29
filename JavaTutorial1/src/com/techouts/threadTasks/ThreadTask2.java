package com.techouts.threadTasks;

public class ThreadTask2 {

	public static void main(String[] args) throws Exception {

		ThreadAdd add=new ThreadAdd();
		ThreadAvg avg=new ThreadAvg();
		ThreadDisplay display=new ThreadDisplay();
		add.start();
		avg.start();
		add.join();
		avg.join();
		display.start();
	}

}
