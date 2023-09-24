//Below code is the main method for the "Vehicle.java.
package Inheritances;

public class Vehicle_main 
{
	public static void main(String[] args) 
	{
		Vehicle v1=new Bus();
		v1.move();
		Bus b1=(Bus) v1;                    //Upcasting
		b1.carry();
		b1.move();
		Vehicle v2=(Vehicle) new Truck();    //Downcasting.
		v2.move();
		Truck t1=(Truck)v2;
		t1.move();
		t1.transport();
	}
}
