//Below we can see the code for abstract class.

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

