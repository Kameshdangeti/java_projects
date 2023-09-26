           //ArrayIndexOutOfOBoundException

/*package Exceptions;

public class Array_Index_Out_Of_Bound_Exceptions    //For normal Conditions.
{
	public static void main(String[] args) 
	{
		int[]a= {1,2,3,4,5};
		System.out.println(a[4]);
		System.out.println(a[2]);
	}
}*/

/*package Exceptions;                  

public class Array_Index_Out_Of_Bound_Exceptions   //For Abnormal Conditions.
{
	public static void main(String[] args) 
	{
		int[]a= {1,2,3,4,5};
		System.out.println(a[4]);
		System.out.println(a[7]);   //Dangerous Statement.
	}
}*/

//And the exception can be handled by using try/catch block as we can see in below code.

package com.Kamesh.projects.Exception;

public class ArrayIndexOutOfBoundExceptions 
{
	public static void main(String[] args) 
	{
		int[]a= {1,2,3,4,5};
		System.out.println(a[4]);
		try
		{
		System.out.println(a[7]);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
           System.out.println("Invalid Index boundaries in array it should be within array.");
		}
	}

}
