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
class Main
{
	public static void main(String[] args) 
	{
		Vehicle v1=new Bus();
		v1.move();
		Bus b1=(Bus) v1;
		b1.carry();
		b1.move();
		Vehicle v2=(Vehicle) new Truck();
		v2.move();
		Truck t1=(Truck)v2;
		t1.move();
		t1.transport();
	}
}
