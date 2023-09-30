package com.Kamesh.projects.PractisingInheritance;

public class MultiLevelInheritance 
{
	public void result1()
	{
		System.out.println("Result 1");
	}
}
class Outcome extends MultiLevelInheritance
{
	public void result2()
	{
		System.out.println("Result 2");
	}
}
class End extends Outcome
{
	public void result3()
	{
		result1();
		result2();
		System.out.println("Result 3");
	}
}
