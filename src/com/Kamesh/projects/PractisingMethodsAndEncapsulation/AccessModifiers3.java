package com.Kamesh.projects.PractisingMethodsAndEncapsulation;

public class AccessModifiers3 {
	public double d = 22.2;
	private int i = 10;
	protected char ch = 'K';
	boolean b = true;

	public static void main(String[] args) {
		AccessModifiers3 a3 = new AccessModifiers3();
		System.out.println("Private value :" + a3.i);
		System.out.println("public value :" + a3.d);
		System.out.println("protected value :" + a3.ch);
		System.out.println("Default value :" + a3.b);
	}
}
