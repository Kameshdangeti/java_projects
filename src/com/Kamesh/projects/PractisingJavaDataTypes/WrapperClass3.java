package com.Kamesh.projects.PractisingJavaDataTypes;

public class WrapperClass3
{
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		byte a=10;
		long b=20;
		short c=30;
		int d=40;
		float e=50.5f;
		double f=60.60;
		char g='C';
		boolean h=true;
		Byte a1=new Byte(a);
		System.out.println("Wrapped Byte value:"+a);
		Long b1=new Long(b);
		System.out.println("Wrapped Long value:"+b);
		Short c1=new Short(c);
		System.out.println("Wrapped Short value:"+c);
		Integer d1=new Integer(d);
		System.out.println("Wrapped Integer value:"+d);
		Float e1=new Float(e);
		System.out.println("Wrapped Float value:"+e);
		Double f1=new Double(f);
		System.out.println("Wrapped Double value:"+f);
		Character g1=new Character(g);
		System.out.println("Wrapped Character value:"+g);
		Boolean h1=new Boolean(h);
		System.out.println("Wrapped Boolean value:"+h);
	}
}
