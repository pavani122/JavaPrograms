package com.techouts.threadTasks;

public class Thread3 extends Thread {
	
	public void run()
	{
			for(int i=1;i<=3;i++) 
			{
			System.out.println("***************thread-3*************");
			}
			System.out.println("Name of the th3 is: "+Thread.currentThread().getName());	
			
		
	}

}
