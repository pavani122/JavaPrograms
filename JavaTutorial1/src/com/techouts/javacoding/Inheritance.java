package com.techouts.javacoding;
 class Base
{
	int a=2,b=3;
	 void add()
	{
		int c=a+b;
		System.out.println(c);
	}
}

public class Inheritance extends Base {

	
		void product()
		{
			int d=a*b;
			System.out.println(d);
		
		}
		public static void main(String[] args) {
			Inheritance obj=new Inheritance();
			obj.add();
			obj.product();
			
	}

}
