package com.Kamesh.projects.PractisingInheritance;

interface RunTimePolymorphism4 
{
   void noise();
}
class Elephant implements RunTimePolymorphism4
{
	public void noise()
	{
		System.out.println("Elephant shouts");
	}
}
class Rat implements RunTimePolymorphism4
{
	public void noise()
	{
		System.out.println("Rat makes noises");
	}
}
