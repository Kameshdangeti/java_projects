package com.Kamesh.projects.PractisingExceptionalHandling;

public class ArithmeticException 
{
	public static void main(String[] args)
	{
		int a=100;
		int b=0;
		try 
		{
			int c=a/b;
		} 
		catch (Exception e) 
		{
			System.out.println("HII");
			System.out.println("Exception Handled");
		}
	}
}
