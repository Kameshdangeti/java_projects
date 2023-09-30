package com.Kamesh.projects.PractisingInheritance;

abstract public class AbstractClass4 
{
  abstract public void work();
}
class Manager extends AbstractClass4
{
	public void work()
	{
		System.out.println("Work is managed");
	}
}
