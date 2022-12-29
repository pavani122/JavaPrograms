package com.techouts.tasks;

public class BoxMain {
	
	public static void main(String[] args) {
		
		Box b=new Box(5,6,7);
		b.area();
		b.volume();
		b=new Box3D(8,4,2);
		b.area();
		b.volume();
	}

}
