  //Compile-Time Polymorphism.

package Polymorphism;

public class Addition 
{
	public static void add(int i, int k)
	{
		System.out.println(i+k);
	}
	public static void add(int i,double k)
	{
		System.out.println(i+k);
	}
	public static void add(int i,double k,int j)
	{
		System.out.println(i+j+k);
	}
}

