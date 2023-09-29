package com.Kamesh.projects.PractisingInheritance;

public class Casting 
{
   public void move()
   {
	   System.out.println("Vehicles move");
   }
}
class Bus extends Casting
{
	public void carry()
	{
		System.out.println("Bus carries");
	}
}
class Lorry extends Bus
{
	public void trasport()
	{
		System.out.println("Lorry transports");
	}
}