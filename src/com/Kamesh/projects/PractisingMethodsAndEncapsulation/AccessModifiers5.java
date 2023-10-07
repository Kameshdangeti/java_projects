package com.Kamesh.projects.PractisingMethodsAndEncapsulation;

public class AccessModifiers5 {
	public double d = 22.2;
	private int i = 10;
	protected char ch = 'K';
	boolean b = true;

	public static void main(String[] args) {
		AccessModifiers5 a5 = new AccessModifiers5();
		System.out.println("Private value :" + a5.i);
		System.out.println("public value :" + a5.d);
		System.out.println("protected value :" + a5.ch);
		System.out.println("Default value :" + a5.b);
	}
}
