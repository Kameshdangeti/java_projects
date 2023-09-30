package com.Kamesh.projects.PractisingInheritance;

interface RunTimePolymorphism2 
{
   void noise();
}
class Tiger implements RunTimePolymorphism2
{
   public void noise()
   {
	   System.out.println("Tiger roars");
   }
}
class Dog implements RunTimePolymorphism2
{
	public void noise()
	{
		System.out.println("Dog Barks");
	}
}