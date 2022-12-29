package com.techouts.streams;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		
	

		String[] st=new String[5];
		st[0]="abc:";
		st[1]="123";
		System.out.println(st[0].toUpperCase());
		System.out.println(st[1].toUpperCase());
		//System.out.println(st[2].toUpperCase()); //cannot access null value
		
		Optional<String> o=Optional.ofNullable(st[2]);
		System.out.println(o.isPresent());

	}

}
