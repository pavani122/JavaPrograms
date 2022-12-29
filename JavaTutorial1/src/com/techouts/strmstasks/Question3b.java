/*b). Can a functional interface extend/inherit another interface? 
 * Explain it and Give an example for both cases.*/

package com.techouts.strmstasks;
//functional interface can be extended but cannot have a abstract method
@FunctionalInterface
interface Example2 extends Example12
{
	 default void display()
	{
		System.out.println("this is a interface that extends Runnable interface");
	}
}
public class Question3b{
	
	public static void main(String[] args) {
		
		Example2 obj=new RunMethod()::run;
		obj.run();
		obj.display();
		
		

		
		
	}

}
