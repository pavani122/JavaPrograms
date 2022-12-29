package com.techouts.javacoding;

public class Constructor {
	String name;
	 int age;

	
		

		Constructor()
		{
			name="pavani";
			age=20;
		}
        Constructor(String n,int a)
        {
        	name=n;
        	age=a;
        }
        public static void main(String[] args) {
        	
        Constructor c=new Constructor();
        Constructor c1=new Constructor("jyo",19);
        System.out.println((c.name)+(c.age)); 
        System.out.println((c1.name)+(c1.age));
	}

}
