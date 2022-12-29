package com.techouts.streams;

import java.util.Arrays;

public class ParallelSortDemo {

	public static void main(String[] args) {

		int[] nums= {1,34,8,22,6,2};
		System.out.println("original arraylist: ");
		Arrays.stream(nums).forEach(System.out::println);
		
		
		Arrays.parallelSort(nums);
		System.out.println("after sorting using parallel sort");
		
		Arrays.stream(nums).forEach(System.out::println);

	}

}
