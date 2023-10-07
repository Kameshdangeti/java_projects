//Below code is the main method for the "CreatingUpCatsingAndDownCasting.java.
package com.Kamesh.projects.Inheritance;

public class CreatingUpCatsingAndDownCastingMain {
	public static void main(String[] args) {
		CreatingUpCatsingAndDownCasting v1 = new Bus();
		v1.move();
		Bus b1 = (Bus) v1; // Upcasting
		b1.carry();
		b1.move();
		CreatingUpCatsingAndDownCasting v2 = (CreatingUpCatsingAndDownCasting) new Truck(); // Downcasting.
		v2.move();
		Truck t1 = (Truck) v2;
		t1.move();
		t1.transport();
	}
}
