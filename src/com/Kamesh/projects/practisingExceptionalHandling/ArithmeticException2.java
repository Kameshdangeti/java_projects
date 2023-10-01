package com.Kamesh.projects.practisingExceptionalHandling;

public class ArithmeticException2 
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
	    System.out.println("HELLO");
	}
}
