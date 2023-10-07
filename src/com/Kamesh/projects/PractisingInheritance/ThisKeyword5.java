package com.Kamesh.projects.PractisingInheritance;

public class ThisKeyword5 {
	public ThisKeyword5() {
		System.out.println("No-Arguments are there in constructors.");
	}

	public ThisKeyword5(int a) {
		this();
		System.out.println("This has Integer Constructors.");
		System.out.println("A :" + a);
	}

	public ThisKeyword5(double b) {
		this(10);
		System.out.println("This has Double Constructors.");
		System.out.println("B :" + b);
	}
}
