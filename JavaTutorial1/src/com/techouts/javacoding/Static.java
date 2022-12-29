package com.techouts.javacoding;

public class Static {

	
		int id;
		static String  c;
		Static()
		{
			id=10;
				c="ibm";
		}
		
		
		public static void main(String[] args) {
			Static st=new Static();
					c="techouts";
					
					System.out.println((st.id)+":"+c);

	}

}
