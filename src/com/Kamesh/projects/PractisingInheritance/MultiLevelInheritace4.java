package com.Kamesh.projects.PractisingInheritance;

public class MultiLevelInheritace4 
{
	public void result1()
	{
		System.out.println("Result 1");
	}
}
class Outcome3 extends MultiLevelInheritance
{
	public void result2()
	{
		System.out.println("Result 2");
	}
}
class End3 extends Outcome3
{
	public void result3()
	{
		result1();
		result2();
		System.out.println("Result 3");
	}
}
