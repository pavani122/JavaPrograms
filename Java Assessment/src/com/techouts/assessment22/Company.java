/*Provide an interface Company with 
	default method of return type double calculating the profit(CP-SP)
	static method of return type String which takes (double) 
	input from previous method and returns company name.
	Abstract method String getCompDetails(double profit,String name);
	=>Needs to be implemented using Lambda expression.*/

package com.techouts.assessment22;
public interface Company {

	String getCompDetails(double profit,String name);
	default double profit(double cp,double sp)
	{
		return sp-cp;
	}
	static String name(String name)
	{
		return name;
	}
}
