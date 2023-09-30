package com.Kamesh.projects.PractisingInheritance;

interface RunTimePolymorphism5 
{
	void noise();
}
class Rhino implements RunTimePolymorphism5
{
	public void noise()
	{
		System.out.println("Rhino makes Big Noise");
	}
}
class Snake implements RunTimePolymorphism5
{
	public void noise()
	{
		System.out.println("Snakes makes Hissing noise");
	}
}