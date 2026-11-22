package com.tester;

import com.model.Driver;
import com.service.Travel;

public class Test {
	
	public static void main(String[] args) {
		
		Driver driver1 =new Driver(1,"Hari","Car",300.0);
		System.out.println(driver1);
		Travel travel = new Travel();
		travel.isCarDriver(driver1);
		
		System.out.println(travel.isCarDriver(driver1));
		
		Driver[] drivers =new Driver[4];
		
		drivers[0] =new Driver(2,"Manasa","Car",200.0);
		drivers[1] =new Driver(3,"Vijaya","Auto",300.0);
		drivers[2] =new Driver(4,"Sravani","Auto",100.0);
		drivers[3] =new Driver(5,"Narayana","Car",250.0);
		
		
		String message = travel.retrivebyDriverId(drivers, 2);
		
		System.out.println(message);
		
		int count = travel.retriveCountOfDriver(drivers, "Car");
		System.out.println(count);
		
		Driver[] resultDrivers = travel.retriveDriver(drivers,"Car");
		
		for(Driver driver:resultDrivers) {
			System.out.println(driver);
		}
		
		Driver driver =  travel.retriveMaximumDistanceTravelledDriver(drivers);
	System.out.println(driver);
		
	}

}
