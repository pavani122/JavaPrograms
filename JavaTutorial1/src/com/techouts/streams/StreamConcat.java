package com.techouts.streams;

import java.util.*;
import java.util.stream.Stream;

public class StreamConcat {

	public static void main(String[] args) {

		List<String> names=Arrays.asList("sharanya","meghana","swathi");
		List<Integer> numbers=Arrays.asList(1,2,3);
		
		Stream.concat(names.stream(),numbers.stream())
		.forEach(str->System.out.println(str));
		
	}

}
