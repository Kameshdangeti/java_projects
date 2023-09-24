//Below we can see the code for abstract class.
//And the main method of this code is written on "TL_Main.java".

package Inheritances;

abstract public class TL
{
	abstract public void work();
}
class Developer extends TL
{
	public void work()
	{
		System.out.println("Work is done");
	}
}

