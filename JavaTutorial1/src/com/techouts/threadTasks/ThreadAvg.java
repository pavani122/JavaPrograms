package com.techouts.threadTasks;

public class ThreadAvg extends Thread {

	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(i==j)
				{
					System.out.println("This is thread that performs average operation");
					System.out.println(i+"+"+j+"="+((i+j)/2));
					
					
				}
			}
		}

	}
}
