//Below we can see the code for the Method overriding.
package Method_OverRiding;

 class Excercise
{
	public void run()
	{
		System.out.println("Running is an Excercise");
	}
	public void gym()
	{
		System.out.println("gym is also an Excercise");
	}
}
 class Health extends Excercise
 {
	 public void yoga()
	 {
		 System.out.println("Yoga is also an Exercise");
	 }
 } 
class Diet extends Health                    //Method Overrided.
{
	public void yoga()
	{
		System.out.println("yoga is best");
	}
	public void gym()
	{
		System.out.println("gym is also best");
	}
}
