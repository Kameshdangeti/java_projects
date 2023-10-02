package com.Kamesh.projects.PractisingExceptionalHandling;

public class StringIndexOutOfBoundExceptions2 
{
	public static void main(String[] args)
	{
		String a="Ramesh";
		System.out.println(a.charAt(2));
		System.out.println(a.charAt(5));
		try 
		{
			System.out.println(a.charAt(7));
		}
		catch (StringIndexOutOfBoundsException e) 
		{
			System.out.println("Invalid index out of boundary,it should within the String index");
		}
	}
}
