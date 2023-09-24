//Below we can see the code for casting i.e., both upcasting and downcasting.


package Casting;

 class Vehicle 
{
	public void move()
	{
	  System.out.println("Vehicles move");	
	}
}
 class Bus extends Vehicle
 {
	 public void carry()
	 {
		 System.out.println("Buses carry");
	 }
 }
class Truck extends Bus
{
	public void transport()
	{
		System.out.println("Trucks transports goods");
	}
}


