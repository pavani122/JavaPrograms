package com.techouts.streams;

import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringJoinerDemo {

	public  void strjoinr() {

		StringJoiner sj=new StringJoiner("@");
		sj.add("......");
		sj.add("**********");
		sj.add("----------");
		System.out.println(sj);
		
		StringJoiner sj2=new StringJoiner("-");
		sj2.add("a");
		sj2.add("b");
		sj2.add("c");
		System.out.println(sj2);
		
		String str=Stream.of("abc","ABC","aBc").collect(Collectors.joining(":","(",")"));
		System.out.println(str);
		System.out.println(str.length());
		
		//concatenation of two strings using stringjoiner
		
		StringJoiner merged=sj.merge(sj2);
		System.out.println(merged);
		
	}

}
