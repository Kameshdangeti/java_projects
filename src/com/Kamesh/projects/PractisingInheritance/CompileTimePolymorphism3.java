package com.Kamesh.projects.PractisingInheritance;

public class CompileTimePolymorphism3 {
	public static void sub(int x, int y) {
		System.out.println(y - x);
	}

	public static void sub(double x, double y) {
		System.out.println(y - x);
	}

	public static void sub(int x, double y, double z) {
		System.out.println(z - x);
	}
}
