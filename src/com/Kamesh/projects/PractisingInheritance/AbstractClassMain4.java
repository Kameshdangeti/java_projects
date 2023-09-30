package com.Kamesh.projects.PractisingInheritance;

public class AbstractClassMain4 
{
	public static void main(String[] args) 
	{
		Manager m =new Manager();
		m.work();
		AbstractClass4 a4 =(AbstractClass4) new Manager();
		a4.work();
	}
}
