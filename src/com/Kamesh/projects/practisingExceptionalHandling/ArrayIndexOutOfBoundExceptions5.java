package com.Kamesh.projects.PractisingExceptionalHandling;

public class ArrayIndexOutOfBoundExceptions5 
{
	public static void main(String[] args)
	{
	     int[]d= {17,18,19,20};
	     System.out.println(d[3]);
	     try 
	     {
			System.out.println(d[6]);
		 } 
	     catch (ArrayIndexOutOfBoundsException e)
	     {
	         System.out.println("Invalid Index array out of boundary,it should be with in Array index.");
		}
	}
}
