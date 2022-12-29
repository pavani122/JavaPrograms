package com.techouts.threadTasks;

class MyThread extends Thread
{
	public void run()  //run method
	{
		for(int i=1;i<=5;i++)
		{
			if(i==1)
			{
		       try {
					System.out.println("the value of i is: "+i);
				MyThread.sleep(3000);
				}
				catch(Exception e) {
					System.out.println("interrupted while sleeping");
				}
			}
			else
			{
		       try {
					System.out.println("the value of i is: "+i);
				MyThread.sleep(2000); }
				catch(Exception e) {
					System.out.println("interrupted while sleeping");
				}
			}
		}
	}
}

public class ThreadTask4 {

	public static void main(String[] args) throws Exception {
		
		MyThread th=new MyThread();   //creation of thread
		MyThread th1=new MyThread(); 
		
		System.out.println("calling start method using first thread object");
		th.start();
		
		System.out.println("is th is alive: "+(th.isAlive()));
		System.out.println("state of th is: "+(th.getState()));
		try {
		th.wait(2000);
		}
		catch(Exception e) {
			System.out.println("is th is alive: "+(th.isAlive()));
			System.out.println(e);
		}
		try {
        th.notify();
		}
		catch(Exception e) {
			System.out.println("is th is alive: "+(th.isAlive()));
			System.out.println(e); 
		}
        
		th.join();
		
		System.out.println("is th is alive: "+(th.isAlive()));
		System.out.println("state of th is: "+(th.getState()));
		
		System.out.println("calling start method using second thread object");
		th1.start();
        System.out.println("state of th1 is: "+(th1.getState()));
		
        
		
	}

}
