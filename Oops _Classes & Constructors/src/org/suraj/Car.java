package org.suraj;

public class Car {
	private String carName;
	private String name;
	private double speed;
	private String engine;
	
	//Default constructor created 
	public Car() {
		this.carName = "car";
		this.name = "suraj";
		this.speed = 200;
		this.engine = "Strong";
	}
	
	//Constructor with Fields
	public Car(String carName, String name, double speed, String engine) {
		
		this.carName = carName;
		this.name = name;
		this.speed = speed;
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [carName=" + carName + ", name=" + name + ", speed=" + speed + ", engine=" + engine + "]";
	}

	// getter setter for classes variable
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getSpeed() {
		return speed;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	// functionallity in class
	public String run() {
		if(speed > 0 && engine.equals("on")) {
			return "car is running";
		}else {
			return "car is not running";	
		}
		
	}

}
