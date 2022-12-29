package com.techouts.collections;
import java.util.*;

public class ArraySort {

	public static void main(String[] args) {

		String[] arr={"Pavani","Jyothika","Durga","Yashashwini","Soma"};
		System.out.println("Elements of array:");
		for(String s:arr)
		{
			System.out.println(s);
		}
		TreeSet<String> ts=new TreeSet<>();
		Collections.addAll(ts, arr);
		System.out.println("Elements in sorted order");
		for(String s:ts)
		{
			System.out.println(s);
		}
	}

}
