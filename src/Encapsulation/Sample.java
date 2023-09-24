//Below we can see the code  for Access Modifiers.s
//We know that they are of 4 types public,private,protected,Default.
//Firstly we written every modifier in a same class and package,then we can get all the outputs.
//to show the complete working of the Access_Modifiers we took 2 packages named Encapsulation and Access_Modifiers.
//Because then only we can know whether all the access modifiers can work out of the class or not.
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
