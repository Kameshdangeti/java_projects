package com.Kamesh.projects.PractisingMethodsAndEncapsulation;

public class AccessModifiers2 {
	public double d = 22.2;
	private int i = 10;
	protected char ch = 'K';
	boolean b = true;

	public static void main(String[] args) {
		AccessModifiers2 a2 = new AccessModifiers2();
		System.out.println("Private value :" + a2.i);
		System.out.println("public value :" + a2.d);
		System.out.println("protected value :" + a2.ch);
		System.out.println("Default value :" + a2.b);
	}
}
