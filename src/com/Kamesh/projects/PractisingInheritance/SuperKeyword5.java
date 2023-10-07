package com.Kamesh.projects.PractisingInheritance;

public class SuperKeyword5 {
	public SuperKeyword5() {
		System.out.println("Father is elder in the family");
	}
}

class kid extends SuperKeyword5 {
	public kid() {
		System.out.println("Son is the eldest in the kids");
	}
}