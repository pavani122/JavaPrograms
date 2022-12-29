package com.techouts.tasks;

public class SubAllenSolly extends AllenSolly {
	String jeans;
	void jeansPair(String jeans)
	{
		super.jeansPair("4 button jeans");
		System.out.println("this  is a new pair of jeans "+ jeans);
	}
}