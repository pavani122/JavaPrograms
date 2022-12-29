package com.techouts.assessment27;

public class Question27 {

	public static void main(String[] args) {
		int arr[]= new int[5];
		try
		{
			arr[5]=15;
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e+"\nplease check the size of the array and then initialize");
			try {
		    int a=5,b=0;
			System.out.println(a/b);
			}	
		    catch(ArithmeticException e1)
	    {
			       System.out.println(e1+"\ndenominator cannot be zero");
			      try {
		                String c=null;
			            System.out.println(c.length());
		              }
		          catch(NullPointerException e2)
		              {
			             System.out.println(e2+"\ncannot get the length of null value");
		              }
	    }
		}
	}

}
