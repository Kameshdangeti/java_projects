package com.Kamesh.projects.PractisingInheritance;

public class Casting2 
{
	 public void move()
	   {
		   System.out.println("Vehicles move");
	   }
	}
	class Bus1 extends Casting
	{
		public void carry()
		{
			System.out.println("Bus carries");
		}
	}
	class Lorry1 extends Bus
	{
		public void trasport()
		{
			System.out.println("Lorry transports");
		}
}
