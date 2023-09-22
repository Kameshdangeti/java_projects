//Below we can see the code for super keyword for constructor and objects.

package Inheritances;

public class Father 
{
	public Father()
	{
		System.out.println("Father is elder in family");
	}
}
class Son extends Father
{
	public Son()
	{
		super();
		System.out.println("Son is younger in the family");
	}
}

