package com.techouts.pavani;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SwitchCase {

	public static void main(String[] args) {
      
		System.out.println("1.addition \n 2.subtraction \n 3.multiplication \n 4.division \n 5.modulus division");
		int a=2,b=3;
		int n=5;
		switch(n)
		{
		
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a*b);
			break;
		case 4:
			System.out.println(a/b);
			break;
		default:
			System.out.println(a%b);
		}
		
				
	}

}
