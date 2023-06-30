package org.parent;

public class Vehicles {

	private String engineString;
	private int wheels;
	private int seats;
	private int fuelTank;
	private String light;
	
	
	public Vehicles() {
		this.engineString = "ABC";
		this.wheels = 4;
		this.seats = 4;
		this.fuelTank = 2;
		this.light = "on";
	}



	public Vehicles(String engineString, int wheels, int seats, int fuelTank, String light) {
		this.engineString = engineString;
		this.wheels = wheels;
		this.seats = seats;
		this.fuelTank = fuelTank;
		this.light = light;
	}
	

	public String getEngineString() {
		return engineString;
	}


	public int getWheels() {
		return wheels;
	}


	public int getSeats() {
		return seats;
	}


	public int getFuelTank() {
		return fuelTank;
	}


	public String getLight() {
		return light;
	}

}
