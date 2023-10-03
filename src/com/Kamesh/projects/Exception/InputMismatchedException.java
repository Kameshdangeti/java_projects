      //InputMisMatchedException
/*package Exceptions;

import java.util.Scanner;

public class Input_Mismatched_Exception 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer value :");
		int n=sc.next();                                 //Dangerous Statement.
		System.out.println(n);
	}
}*/

//And the exception can be handled by using try/catch block as we can see in below code.

package com.Kamesh.projects.Exception;

import java.util.Scanner;

public class InputMismatchedException 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer value :");
		try
		{
		String n=sc.next();
		System.out.println(n);
		}
	catch (Exception e)
		{
		// TODO: handle exception
	}
	}

}
