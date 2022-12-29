/*A String contains a list of states and capitals. 
 * Write a method which can parse the string and return the states
and capitals as map with state as key and capital as value.
The String is in the below format. The state and capital is separated by a delimiter (del1).
There will be multiple state-capital pairs and each state – capital pair
 is separated by another delimiter (del2).
Ex: Input will be tamilnadu||chennai-karanataka||bengaluru.
Here, || will be provided as del1 and - will be provided as del2.*/

package com.techouts.collections20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringJoiner;

public class Question20 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.nextLine();
		HashMap<String , String> map = new HashMap<>();
		
		String[] arr=s.split("-");
		for(String s1:arr)
		{
			String[] arr1=s1.split("[||]");
			String state=arr[0].trim();
			String capital=arr1[2].trim();
			map.put(state, capital);
		}
		System.out.println(map);

}
}