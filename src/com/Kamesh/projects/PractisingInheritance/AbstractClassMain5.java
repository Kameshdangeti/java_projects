package com.Kamesh.projects.PractisingInheritance;

public class AbstractClassMain5 
{
	public static void main(String[] args)
	{
		Boss b = new Boss();
		b.work();
		AbstractClass5 a5=(AbstractClass5) new Boss();
		a5.work();
	}
}
