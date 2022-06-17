package com.techouts.pavani;

public class OPerators {

	public static void main(String[] args) {
       
		int a=2,b=3,c=4;  //Arithmetic operators
		System.out.println("addition "+(a+b));
		System.out.println("subtraction "+(a-b));
		System.out.println("multiplication "+a*b);
		System.out.println("division "+a/b);
		System.out.println("modulus division "+a%b);
		//relational operators
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a==b);
		System.out.println(a!=b);
		//logical operators
		System.out.println(a>b && a>c);
		System.out.println(a>b || a>c);
		//Assignment operators
		a+=2;
		System.out.println(a);
		b-=3;
		System.out.println(b);
		//bitwise operators
		System.out.println("bitwise AND "+(2 & 5));
		System.out.println("bitwise OR "+(2 ^ 5));
		//terenary operator
		int m=5,n=6;
		System.out.println((m>n)?m:n);
		//unary operators
		m=++n;
		m=n++;
		System.out.println(m);
		System.out.println(n);
		//shift
		System.out.println("binary left shift"+(5<<3));
		System.out.println("binary right shift"+(5 >> 2));
		System.out.println(2 >>> 5);
	}

}
