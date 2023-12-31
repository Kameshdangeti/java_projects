package com.Kamesh.projects.PractisingJavaDataTypes;

public class WrapperClass {
	public static void main(String[] args) {
		byte a = 10;
		long b = 20;
		short c = 30;
		int d = 40;
		float e = 50.5f;
		double f = 60.6;
		char g = 'L';
		boolean h = true;

		Byte a1 = new Byte(a);
		System.out.println("Wrapped byte value:" + a);
		a1.byteValue();

		Long b1 = new Long(b);
		System.out.println("Wrapped long value:" + b);
		b1.longValue();

		Short c1 = new Short(c);
		System.out.println("Wrapped Short value:" + c);
		c1.shortValue();

		Integer d1 = new Integer(d);
		System.out.println("Wrapped integer value:" + d);
		d1.intValue();

		Float e1 = new Float(e);
		System.out.println("Wrapped Float value:" + e);
		e1.floatValue();

		Double f1 = new Double(f);
		System.out.println("Wrapped Double value:" + f);
		f1.doubleValue();

		Character g1 = new Character(g);
		System.out.println("Wrapped Character value:" + g);
		g1.charValue();

		Boolean h1 = new Boolean(h);
		System.out.println("Wrapped character value:" + h);
		h1.booleanValue();
		// Here a1,b1,c1,d1,e1,f1,g1,h1 are object reference variables it is not used
		// so,it creates Warning.
		// To overcome the warning we use int value,boolean value etc.
	}
}
