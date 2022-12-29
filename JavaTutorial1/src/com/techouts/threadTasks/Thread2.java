package com.techouts.threadTasks;

public class Thread2 extends Thread{

	public void run()
	{
		
		try
		{
			for(int i=1;i<=3;i++) {
				Thread2.sleep(2000);  }
			
		}
			catch(Exception e)
		
		{
				System.out.println("Name of the th3 is: "+Thread.currentThread().getName());		
				
		}
		
	}
}
