package org.suraj;


public class Classes {
	
	public static void main(String[] args) {
	
	Car car = new Car( "name", "suraj", 64, "on");
//	car.setSpeed(40.8);
	System.out.println(car.toString());
	Car car2 = new Car();
	System.out.println(car2.toString());

	}

}
