package com.techouts.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamParallel {

	static long start = 0, end = 0;
	static long start1 = 0, end1 = 0;

	public static void main(String[] args) throws InterruptedException {

//		start=System.currentTimeMillis();
//		IntStream.range(1, 100).parallelStream().forEach(System.out::print);
//		end=System.currentTimeMillis();
//	
//		System.out.println("\nthe time took to exceute the above code with parallel stream is: "
//		+(end-start));
//		
//		start=System.currentTimeMillis();
//		IntStream.range(1, 100).forEach(System.out::print);
//		end=System.currentTimeMillis();
//		
//		System.out.println("\nthe time took to exceute the above code is: "+(end-start));
//		System.out.println("---------------------------------------------------");
//		
		List<Integer> list = Arrays.asList(1, 3, 5, 2,8);

		start = System.nanoTime();
		list.parallelStream().forEach(System.out::println);
		end = System.nanoTime();
		System.out.println("using parallel stream: " + (end - start));

		Thread.sleep(5000);
		List<Integer> list1 = Arrays.asList(1, 3, 5, 2,8);

		start1 = System.nanoTime();
		list1.stream().forEach(System.out::println);
		end1 = System.nanoTime();
		System.out.println("without using parallel stream: " + (end1 - start1));

	}

}
