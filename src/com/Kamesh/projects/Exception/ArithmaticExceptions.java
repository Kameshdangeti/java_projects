//In ths we will know about commonly used Exceptions.

//we know that exceptions are of 2types checked and unchecked Exceptions.

//Checked Exceptions are again subdivided into many type we can see them one by one and handling the exception 
// can also be seen in this.

//1.Un-Checked Exceptions/Run-Time Exceptions:-
	
               //ArithmaticException.
/*package Exceptions;

public class Arithmatic_Exceptions 
{
	public static void main(String[] args) 
	{
		int a=200;
		int b=0;
		int c=a/b;               //Dangerous Statement
		System.out.println(c);
		System.out.println("Good morning");	
	}
}*/

//And the exception can be handled by using try/catch block as we can see in below code.

package com.Kamesh.projects.Exception;

public class ArithmaticExceptions 
{
	public static void main(String[] args) 
	{
		int a=200;   
		int b=0;
		try
		{
		int c=a/b;
		}
		catch (Exception e)
		{
			System.out.println("Exception Handled");
		}
		System.out.println("Good morning");	
	   }
}
