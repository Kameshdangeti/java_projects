package com.Kamesh.projects.PractisingInheritance;

public class AbstractClassMain2 
{
	public static void main(String[] args) 
	{
		Developer d= new Developer();
		d.work();
		AbstractClass2 a2 =(AbstractClass2) new Developer();
		a2.work();
	}
}
