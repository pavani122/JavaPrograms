package com.techouts.assessment5;

public class Question5 {
	
	private String name;
	private long aadhar;

	String person(String name,long aadhar)
	{
		return ((this.name=name)+(this.aadhar=aadhar));
	}

	public static void main(String[] args) {

		Question5 obj=new Question5();
		obj.person("meghana", 293847599098l);
		System.out.println("name:"+obj.name);
		System.out.println("Aadhar number:"+obj.aadhar);
	}

}
