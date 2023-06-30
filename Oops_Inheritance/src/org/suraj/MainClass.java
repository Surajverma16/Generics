package org.suraj;


import org.child.Bike;
import org.child.Truck;
import org.parent.Vehicles;

public class MainClass {

	public static void main(String[] args) {
		
		Vehicles vehicles = new Vehicles("CDFD",34, 434, 34,"sdf");
		Bike bike = new Bike("3999");
		
		Truck truck = new Truck();
		truck.airConditioner = "AC";
		
		System.out.println(bike.getEngineString());
		System.out.println(bike.getHandle());
		System.out.println(truck.airConditioner);

	}

}
