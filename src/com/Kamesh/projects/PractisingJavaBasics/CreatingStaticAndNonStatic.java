package com.Kamesh.projects.PractisingJavaBasics;

public class CreatingStaticAndNonStatic {
	public static void name() {
		System.out.println("Lucky");
	}

	public void age() {
		System.out.println("23");
	}

	public static void main(String[] args) {
		CreatingStaticAndNonStatic cns = new CreatingStaticAndNonStatic();
		cns.age();
		name();
	}
}
