package com.techouts.collections14;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Mercedes {
	static int u=10,v=7,w=15,x=32,y=53;

	public void mercedes()
	{
		Map M=new LinkedHashMap();
		M.put("luxury car",u );
		M.put("coupe", v);
		M.put("convertible",w );
		M.put("Roadster", x);
		M.put("Station Wagon", y);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Select any below type of Mercedes");
		System.out.println("1-luxury car \t 2-coupe \t 3-convertible \t 4-Roadster \t 5-Station Wagon");
		int b=sc.nextInt();
		switch(b)
		{
		case 1:
			System.out.println("Booked luxury car");
			u=u-1;
			M.put("luxury car",u);
			System.out.println("Available luxury car cars: "+M.get("luxury car"));
			System.out.println("ThankYou");
			break;
		case 2:
			System.out.println("Booked coupe");
			v=v-1;
			M.put("coupe",v);
			System.out.println("Available coupe cars: "+M.get("coupe"));
			System.out.println("ThankYou");
			break;
		case 3:
			System.out.println("Booked convertible");
			w=w-1;
			M.put("convertible",w);
			System.out.println("Available convertible cars: "+M.get("convertible"));
			System.out.println("ThankYou");
			break;
		case 4:
			System.out.println("Booked Roadster");
			x=x-1;
			M.put("Roadster",x);
			System.out.println("Available Roadster cars: "+M.get("Roadster"));
			System.out.println("ThankYou");
            break;
		case 5:
			System.out.println("Booked Station Wagon");
			y=y-1;
			M.put("Station Wagon",y);
			System.out.println("Available Station Wagon cars: "+M.get("Station Wagon"));
			System.out.println("ThankYou");
      		break;
			
		}

	}

}
