package com.techouts.javacoding;
 
public class Variable {
	
	int a=10; //instance variable
	static int  c=30;   //static variable
	final static float pi=3.14f;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        c=40; 
		int b=20;  //local variable
		Variable obj=new Variable();  //to access the instance variables
		System.out.println("Instance Variable:"+obj.a);
		System.out.println("Local Varaible:"+b);
		System.out.println("Static Variable:"+c);
		System.out.println("final Variable:"+pi);
		
  
  
	}
  
}

