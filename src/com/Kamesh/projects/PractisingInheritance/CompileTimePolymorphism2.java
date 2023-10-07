package com.Kamesh.projects.PractisingInheritance;

public class CompileTimePolymorphism2 {
	public static void Mul(int a, int b) {
		System.out.println(a * b);
	}

	public static void Mul(double a, int b) {
		System.out.println(b * a);
	}

	public static void Mul(int a, double b, int c) {
		System.out.println(a * b * c);
	}
}
