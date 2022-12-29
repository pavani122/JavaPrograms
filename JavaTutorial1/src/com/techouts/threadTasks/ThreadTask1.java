package com.techouts.threadTasks;

class MyThread1 extends Thread
{
	public void run()
	{

		System.out.println("Java is Hot");
		
	}
	
}
class MyThread2 extends Thread
{
public void run()
{
	System.out.println("Java is Aromatic");
}
}

public class ThreadTask1  {
	

	public static void main(String[] args)  {
		
		MyThread1 th1=new MyThread1();
     	MyThread2 th2=new MyThread2();
		th1.start();
		th2.start();
		

	}

}
