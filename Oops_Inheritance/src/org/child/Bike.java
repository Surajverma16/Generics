package org.child;

import org.parent.Vehicles;

public class Bike extends Vehicles {

	private String handle;

	public String getHandle() {
		return handle;
	}

	public Bike(String handle) {
		this.handle = handle;
	}

	public Bike() {
	}

}
