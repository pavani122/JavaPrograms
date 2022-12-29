/*Create a method that can accept an array of String objects and sort in alphabetical order.
The elements in the left half should be completely in uppercase and 
the elements in the right half should be completely in lower case.
Return the resulting array.
Note: If there are odd number of String objects, then (n/2)+1 elements should be in UPPPERCASE
 */

package com.techouts.collections18;
import java.util.*;

public class Question18 {

	public static void main(String[] args) {

		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int s=sc.nextInt();
		String[] arr=new String[s];
		System.out.println("Enter the elements into the array");
		for(int i=0;i<s;i++)
		{
			arr[i]=sc.next();
		}
		System.out.println("Elements are:");
		Arrays.sort(arr);
		if(s%2==0)
		{
			 a=s/2;
		}
		else
		{
			a=(s/2)+1;
		}
		for(int i=0;i<s;i++)
		{
			if(i<a)
			{
				arr[i]=arr[i].toUpperCase();
			}
			else
			{
				arr[i]=arr[i].toLowerCase();

			}
		}
		
		for(int i=0;i<s;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
