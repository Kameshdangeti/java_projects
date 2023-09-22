//Below we can see the code for creation of methods and with arguments and return values.
//And Method Overloading.
package Encapsulation;

public class Create_Methods_with_Arguments_And_Return_Values 
{
	public static class Add
	{
		static int sum(int a1,int a2)
		{ 
			return a1+a2;                                //return values.
		}
		static double sum(double s1,double s2)           //Method Overloading.
		{
			return s1+s2;
		}
	}
	public class mul
	{
		int value;
		public int value(short b1,short b2)
		{
			return b1*b2;
		}
		public float value(float f1, float f2)
		{
			return f1*f2;
		}
	}
	public static void main(String[] args)
	{
		int res1= sum(30,60);
		double res2=sum(20.30,50.60);
		int res3=values(20,30);
		float res4=values(100.10f,200.20f);                           //Method Calling And Passing.
		System.out.println("Adding 2 integers values :"+res1);
		System.out.println("Adding 2 double values :"+res2);
		System.out.println("Multiplying 2 integer values :"+res3);
		System.out.println("Multiplying 2 float values :"+res4);
	}
	public static int values(float f, float g) 
	{
		return 0;
	}
	public  static int sum(double d, double e)
	{
		return 0;
	}
	

}
