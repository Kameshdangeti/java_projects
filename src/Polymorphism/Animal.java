//Polymorphism is nothing but having multiple/more than 1 form.
//Below we can see the codes for polymorphism and we knew that it is of 2 types
//Runtime,compiletime.

                   //Run-Time Polymorphism.
package Polymorphism;

 interface Animal 
{
	void noise();
}

class lion implements Animal
{
	public void noise()
	{
		System.out.println("lion roars.");
	}
}

class Tiger implements Animal
{
	public void noise()
	{
		System.out.println("Tiger roars");
	}
}
class Panther implements Animal
{
	public void noise()
	{
		System.out.println("panther roars");
	}
}