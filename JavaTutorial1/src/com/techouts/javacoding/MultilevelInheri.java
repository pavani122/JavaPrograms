package com.techouts.javacoding;

class A
{
	void baseMethod()
	{
		System.out.println("base class method");
	}
}

class B extends A
{
	void deriveMethod()
	{
		System.out.println("dervived  class method");
	}
}

public class MultilevelInheri extends B{

	public static void main(String[] args) {
  
		MultilevelInheri m=new MultilevelInheri();
		m.baseMethod();
		m.deriveMethod();
		

	}

}
