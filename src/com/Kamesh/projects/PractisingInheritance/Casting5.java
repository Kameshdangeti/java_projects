package com.Kamesh.projects.PractisingInheritance;

public class Casting5 {
	public void move() {
		System.out.println("Vehicles move");
	}
}

class Bus4 extends Casting {
	public void carry() {
		System.out.println("Bus carries");
	}
}

class Lorry4 extends Bus {
	public void trasport() {
		System.out.println("Lorry transports");
	}
}
