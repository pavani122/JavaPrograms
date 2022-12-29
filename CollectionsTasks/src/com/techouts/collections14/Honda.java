package com.techouts.collections14;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Honda {
	static int u=12,v=74,w=26,x=7,y=19;
		
	void honda() {
	Map H=new LinkedHashMap();
	H.put("sedan",u);
	H.put("Hatchback",v);
	H.put("compact car",w);
	H.put("crossover",x);
	H.put("Minivan",y);
	Scanner sc=new Scanner(System.in);
	System.out.println("Select any below type of Honda");
	System.out.println("1-sedan \t 2-Hatchback \t 3-compact car \t 4-crossover \t 5-Minivan");
	int c=sc.nextInt();
	switch(c)
	{
	case 1:
		System.out.println("Booked sedan");
		u=u-1;
		H.replace("sedan",u);
		System.out.println("Available sedan cars: "+H.get("sedan"));
		System.out.println("ThankYou");

		break;
	case 2:
		System.out.println("Booked Hatchback");
		v=v-1;
		H.replace("Hatchback",v);
		System.out.println("Available Hatchback cars: "+H.get("Hatchback"));
		System.out.println("ThankYou");

		break;
	case 3:
		System.out.println("Booked compact car");
		w=w-1;
		H.replace("compact car",w);
		System.out.println("Available compact  cars: "+H.get("compact car"));
		break;
	case 4:
		System.out.println("Booked crossover");
		x=x-1;
		H.replace("crossover",x);
		System.out.println("Available crossover cars: "+H.get("crossover"));
		System.out.println("ThankYou");

		break;
	case 5:
		System.out.println("Booked Minivan");
		y=y-1;
		H.replace("Minivan",y);
		System.out.println("Available Minivan cars: "+H.get("Minivan"));
		System.out.println("ThankYou");

		break;
		
	}
	
	}

}
