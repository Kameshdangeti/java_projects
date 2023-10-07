package com.Kamesh.projects.PractisingMethodsAndEncapsulation;

public class AccessModifiers4 {
	public double d = 22.2;
	private int i = 10;
	protected char ch = 'K';
	boolean b = true;

	public static void main(String[] args) {
		AccessModifiers4 a4 = new AccessModifiers4();
		System.out.println("Private value :" + a4.i);
		System.out.println("public value :" + a4.d);
		System.out.println("protected value :" + a4.ch);
		System.out.println("Default value :" + a4.b);
	}
}
