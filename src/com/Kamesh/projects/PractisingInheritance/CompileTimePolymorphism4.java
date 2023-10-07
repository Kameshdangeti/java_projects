package com.Kamesh.projects.PractisingInheritance;

public class CompileTimePolymorphism4 {
	public static void div(int x, int y) {
		System.out.println(y / x);
	}

	public static void div(double x, double y) {
		System.out.println(y / x);
	}

	public static void div(int x, double y, double z) {
		System.out.println(x / z);
	}
}
