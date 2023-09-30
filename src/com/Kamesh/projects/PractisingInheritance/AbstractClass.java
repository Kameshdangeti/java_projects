package com.Kamesh.projects.PractisingInheritance;

abstract public class AbstractClass 
{
	abstract public void Work();
}
class TeamLead extends AbstractClass
{
	public void Work()
	{
		System.out.println("Work is OnGoing");
	}
}
