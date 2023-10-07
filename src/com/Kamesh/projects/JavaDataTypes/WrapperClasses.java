//Here we can see the code developed for wrapper class for all the Primitive data types
package com.Kamesh.projects.JavaDataTypes;

public class WrapperClasses {
	public static void main(String[] args) {

		// Primitive data types.

		byte a = 10;
		short b = 20;
		int c = 30;
		long d = 4000000l;
		float e = 50.5f;
		double f = 60.678;
		char g = 'K';
		boolean h = true;

		// Wrapping the data types by creating Wrapper objects.

		Byte a1 = new Byte(a);
		System.out.println("Wrapped byte value:" + a);
		a1.byteValue();

		Short b1 = new Short(b);
		System.out.println("Wrapped short value:" + b);
		b1.shortValue();

		Integer c1 = new Integer(c);
		System.out.println("Wrapped int value:" + c);
		c1.intValue();

		Long d1 = new Long(d);
		System.out.println("Wrapped long value:" + d);
		d1.longValue();

		Float e1 = new Float(e);
		System.out.println("Wrapped float value:" + e);
		e1.floatValue();

		Double f1 = new Double(f);
		System.out.println("Wrapped double value:" + f);
		f1.doubleValue();

		Character g1 = new Character(g);
		System.out.println("Wrapped char value:" + g);
		g1.charValue();

		Boolean h1 = new Boolean(h);
		System.out.println("Wrapped boolean value:" + h);
		h1.booleanValue();

		// Here a1,b1,c1,d1,e1,f1,g1,h1 are object reference variables it is not used
		// so,it creates Warning.
		// To overcome the warning we use int value,boolean value etc.
	}
}
