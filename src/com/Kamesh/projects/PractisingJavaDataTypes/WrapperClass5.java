package com.Kamesh.projects.PractisingJavaDataTypes;

public class WrapperClass5 
{
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		byte a=10;
		short b=20;
		long c=30;
		int d=40;
		float e=50.5f;
		double f=60.6;
		char g='Y';
		boolean h=true;
		Byte a1=new Byte(a);
		System.out.println("Wrapped Byte value:"+a);
		Short b1=new Short(b);
		System.out.println("Wrapped Short value:"+b);
		Long c1=new Long(c);
		System.out.println("Wrapped Long value:"+c);
		Integer d1=new Integer(d);
		System.out.println("Wrapped Integer value:"+d);
		Float e1=new Float(e);
		System.out.println("Wrapped Float Value:"+e);
		Double f1=new Double(f);
		System.out.println("Wrapped Double value:"+f);
		Character g1=new Character(g);
		System.out.println("Wrapped Character value:"+g);
		Boolean h1=new Boolean(h);
		System.out.println("Wrapped Boolean value:"+h);
	}
}
