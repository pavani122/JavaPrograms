package com.techouts.streams;

import java.util.Arrays;
import java.util.List;

public class ReduceStrm {

	public static void main(String[] args) {

		List<Integer> list=Arrays.asList(2,36,15,-6,3);
		Integer sum=list.stream().reduce(0, (i1,i2)->(i1+i2));
		System.out.println("reduce method: "+sum);
	}

}
