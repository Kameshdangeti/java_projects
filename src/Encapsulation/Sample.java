//Below we can see the code  for Access Modifiers.
//We know that they are of 4 types public,private,protected,Default.
//Firstly we written every modifier in a same class and package,then we can get all the outputs.
package Encapsulation;

public class Sample 
{
	public int i=10;                 //public.
	private double d=20.2;           //private.
	protected char ch='K';           //Protected.
	boolean b=false;                 //Default.
	public static void main(String[] args) 
	{
		Sample s1 = new Sample();
		System.out.println(s1.i);
		System.out.println(s1.d);
		System.out.println(s1.ch);
		System.out.println(s1.b);
	}

}
