//Below we can see the main methode for "TL.java".
package Inheritances;

public class Tl_main
{
	public static void main(String[] args)
	   {
		Developer d= new Developer();
		d.work();
		TL tl=(TL)new Developer();
		tl.work();
	   }
}
