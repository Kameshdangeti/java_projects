package com.Kamesh.projects.PractisingInheritance;

public class Casting4 {
	public void move() {
		System.out.println("Vehicles move");
	}
}

class Bus3 extends Casting {
	public void carry() {
		System.out.println("Bus carries");
	}
}

class Lorry3 extends Bus {
	public void trasport() {
		System.out.println("Lorry transports");
	}
}
