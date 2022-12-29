package com.techouts.streams;
import java.util.stream.*;
public class StrmItrt {

	public static void main(String[] args) {

////	Stream.iterate(3,count->count+1).filter(i->i%4==0).limit(5)
////	.forEach(System.out::println);
//	
	Stream.iterate(1,n->n==5,n->n+1).limit(10).forEach(str-> System.out.println(str));
	System.out.println("nothing");
	}

}
