package com.Kamesh.projects.PractisingInheritance;

public class Casting3
{
	 public void move()
	   {
		   System.out.println("Vehicles move");
	   }
	}
	class Bus2 extends Casting
	{
		public void carry()
		{
			System.out.println("Bus carries");
		}
	}
	class Lorry2 extends Bus
	{
		public void trasport()
		{
			System.out.println("Lorry transports");
		}
}
