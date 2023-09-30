package com.Kamesh.projects.PractisingInheritance;

interface RunTimePolymorphism3 
{
   void noise();
}
class Panther implements RunTimePolymorphism3
{
	public void noise()
	{
		System.out.println("Panther roars");
	}
}
class cat implements RunTimePolymorphism3
{
	public void noise()
	{
		System.out.println("cats say meow");
	}
}