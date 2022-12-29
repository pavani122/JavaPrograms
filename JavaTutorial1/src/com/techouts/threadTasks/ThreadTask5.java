package com.techouts.threadTasks;

public class ThreadTask5 extends Thread {
	
	public void run()
	{
		
		
			System.out.println("void run"); 
			}
//		catch(Exception e)
//		{
//			System.out.println("sorry i am sleeping");
//		}
//	}

	public static void main(String[] args) {

		ThreadTask5 t5=new ThreadTask5();
		t5.start();
		
		
		
		
	
	}

}
