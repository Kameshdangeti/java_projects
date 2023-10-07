//Below we can see the code for casting i.e., both upcasting and downcasting.

//And the main method is called in seperate class i.e., in "CreatingUpCatsingAndDownCasting.java".

package com.Kamesh.projects.Inheritance;

class CreatingUpCatsingAndDownCasting {
	public void move() {
		System.out.println("Vehicles move");
	}
}

class Bus extends CreatingUpCatsingAndDownCasting {
	public void carry() {
		System.out.println("Buses carry");
	}
}

class Truck extends Bus {
	public void transport() {
		System.out.println("Trucks transports goods");
	}
}
