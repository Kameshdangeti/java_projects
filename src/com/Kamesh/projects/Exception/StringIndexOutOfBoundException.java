//StringIndexOutOfBoundException
/*package Exceptions;

public class String_Index_Out_Of_Bound_Exception     //For normal conditions
{                                                    //No error/Excption occurs.
	public static void main(String[] args) 
	{
	   String s="Kamesh";
	   System.out.println(s.charAt(1));
	   System.out.println(s.charAt(3));
	   System.out.println(s.charAt(5));
	}
}*/

/*package Exceptions;

public class String_Index_Out_Of_Bound_Exception     //For abnorrmal Conditions.
{
	public static void main(String[] args) 
	{
	   String s="Kamesh";
	   System.out.println(s.charAt(1));
	   System.out.println(s.charAt(3));
	   System.out.println(s.charAt(8));          //Dangerous Statement.
	}
}*/

//And the exception can be handled by using try/catch block as we can see in below code.

package com.Kamesh.projects.Exception;

public class StringIndexOutOfBoundException {
	public static void main(String[] args) {
		String s = "Kamesh";
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(3));
		try {
			System.out.println(s.charAt(8));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Invalid data String Should be with in statement.");
		}
	}
}
