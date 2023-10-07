package com.Kamesh.projects.PractisingMethodsAndEncapsulation;

public class AccessModifiersInSeperateClass {
	public static void main(String[] args) {
		AccessModifiers a1 = new AccessModifiers();
		// System.out.println("Private value :"+a1.i);
		System.out.println("public value :" + a1.d);
		System.out.println("protected value :" + a1.ch);
		System.out.println("Default value :" + a1.b);
	}
}
