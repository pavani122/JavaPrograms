/*Create a method which accepts an integer array and removes all the duplicates in the array.
Return the resulting array in descending order*/

package com.techouts.collections19;

import java.util.Arrays;
import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int s=sc.nextInt();
		int[] arr=new int[s];
		System.out.println("Enter the elements into the array");
		for(int i=0;i<s;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		//System.out.println("Array in descending order");
		for(int i=0;i<s;i++)
		{
			for(int j=i+1;j<s;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		int m=arr[0]+1;
		for(int i=0;i<s;i++)
		{
			for(int j=i+1;j<s;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[i]=m;
				}
			}
		}
		System.out.println("array list after removing duplicates in descending order");
		for(int i=0;i<s;i++)
		{
			if(arr[i]!=m)
			{
				System.out.println(arr[i]);
			}
		}
		
	}

}
