/*14.Car company stock maintenance & buying using collections
a. Add a main car company --> it should have type of cars ---> Each type should have list of cars & quantity
Ex: Mercedes --> SUV , Sedan , Compact SUV , crossover etc --> SUV{GLC 330D , GLE 220D , GLD 450}, Hatchback(Glc 200, E class, c class), Coupe{530d}
b. one user can register and select a type of car and buy it , on buying that specific count should be decreased & in console we have to show the details & generate a txt file with all details.
c.Initial data has to be read from Excel file*/


package com.techouts.collections14;
import java.util.*;

public class Question14 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("Select any below type of car");	
		System.out.println("1-Honda \t 2-Mercedes");
		int a=sc.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("You have selected Honda");
			Honda h=new Honda();
			h.honda();
			break;
			
		case 2:
			System.out.println("You have selected Mercedes");
			Mercedes m=new Mercedes();
			m.mercedes();
			break;
			
		default:
			System.out.println("select valid type of car");
			
		}
	
		}

		
	}
}