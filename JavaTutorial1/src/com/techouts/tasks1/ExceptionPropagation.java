package com.techouts.tasks1;

public class ExceptionPropagation {

	
	public static void m1()
	{
		System.out.println("this is m1");
		m2();
	}

	public static void m2() 
	{
		System.out.println("this is m2");
		System.out.println(10/0);

	}
	public static void main(String[] args) {
		try
		{
		m1();
		}
		catch(Exception e)
		{
			System.out.println(e+" this is handled in main method");
			try {
			
			throw new NullPointerException();
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		}
		
	}
}
