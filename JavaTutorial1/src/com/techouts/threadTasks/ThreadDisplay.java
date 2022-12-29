package com.techouts.threadTasks;

public class ThreadDisplay extends Thread {
	
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(i==j)
				{
					System.out.println("This is thread that displays i and j values");
					System.out.println("i: "+i+"\t"+"j: "+j);

				}
			}
		}
	}

}

