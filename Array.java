package com.techouts.pavani;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
//		int a[]= new int[3];
//		a[0]=1;
//		a[1]=2;
//		a[2]=2;	
//		
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.print(a[i]);
//			System.out.println();
//		}
		
		int[][] b = {{1,2,3,4},
				{3,4},
				{7,8,9}};
		
		
		
		for(int j=0;j<b.length;j++)
		{
			for(int k=0;k<b[j].length;k++)
			{
				System.out.print(" "+b[j][k]);
			}
			System.out.println();
		}
	}

}
