package com.Kamesh.projects.PractisingJavaDataTypes;

public class ORVAndPDT {
	float e = 50.5f;
	double f = 60.6;
	char g = 'K';
	boolean h = true;

	public static void main(String[] args) {
		byte a = 10;
		short b = 20;
		long c = 30;
		int d = 40;
		System.out.println("Byte value:" + a);
		System.out.println("Short value:" + b);
		System.out.println("Long value:" + c);
		System.out.println("Integer value:" + d);

		ORVAndPDT o1 = new ORVAndPDT();
		System.out.println("Float value:" + o1.e);
		System.out.println("Double value:" + o1.f);
		System.out.println("Characte value:" + o1.g);
		System.out.println("Boolean value:" + o1.h);
	}
}
