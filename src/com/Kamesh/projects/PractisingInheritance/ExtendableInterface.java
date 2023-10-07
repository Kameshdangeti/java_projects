package com.Kamesh.projects.PractisingInheritance;

interface ExtendableInterface {
	void move();
}

interface Car extends ExtendableInterface {
	void move1();
}

class Vehicle implements Car {
	public void move() {
		System.out.println("Car Moves slow");
	}

	public void move1() {
		System.out.println("Car moves Faster");
	}
}