package com.techouts.threadTasks;

public class Thread1 extends Thread {
	public void run()
	{
		System.out.println("Name of the th1 is: "+Thread.currentThread().getName());
		Thread.currentThread().setName("Pavani");
		System.out.println("Name of the th1 after changing is: "+Thread.currentThread().getName());
		
	}

}
