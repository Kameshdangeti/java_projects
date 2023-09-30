package com.Kamesh.projects.PractisingInheritance;

interface ExtendableInterface3 
{
   public void work();
}
interface Employee extends ExtendableInterface3
{
	public void Work1();
}
class Office implements Employee
{
	public void work()
	{
		System.out.println("Employees work in office.");
	}
	public void Work1()
	{
		System.out.println("Employee can also work from home.");
	}
}