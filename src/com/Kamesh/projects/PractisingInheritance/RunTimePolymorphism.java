package com.Kamesh.projects.PractisingInheritance;

interface RunTimePolymorphism 
{
   void noise();
}
class Lion implements RunTimePolymorphism
{
	public void noise()
	{
		System.out.println("Lion Roars");
	}
}
class Cow implements RunTimePolymorphism
{
	public void noise()
	{
		System.out.println("Cow moo's");
	}
}