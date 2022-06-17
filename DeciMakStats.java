package com.techouts.pavani;

public class DeciMakStats {

	public static void main(String[] args) {
		int amount=2000;
		double dis;
		if(amount>1000)
		{
			dis=amount*0.01;
			System.out.println("discount"+dis);
		}
		else if(amount>2000)
		{
			dis=amount*0.05;
			System.out.println("discount"+dis);
		}
		else if(amount>5000)
		{
			dis=amount*0.10;
			System.out.println("discount"+dis);
		}
		else 
			System.out.println("no discount");
	}

}
