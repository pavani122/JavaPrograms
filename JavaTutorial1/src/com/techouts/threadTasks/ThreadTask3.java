package com.techouts.threadTasks;

public class ThreadTask3 {

	public static void main(String[] args) {

		Thread1 th1=new Thread1();
		Thread2 th2=new Thread2();
		Thread3 th3=new Thread3();
		
		th1.setDaemon(true);
		
		th1.start();
		th2.start();
		th3.start();
		
		System.out.println("Is th1 a  daemon thread:  "+th1.isDaemon());
		System.out.println("State of daemon thread is: "+th1.getState());
		System.out.println("State of th2 is: "+th2.getState());
		System.out.println("State of th3 is: "+th3.getState());

		
		


		
		
	}

}
