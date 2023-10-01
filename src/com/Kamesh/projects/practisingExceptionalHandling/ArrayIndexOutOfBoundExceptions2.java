package com.Kamesh.projects.practisingExceptionalHandling;

public class ArrayIndexOutOfBoundExceptions2 
{
    public static void main(String[] args) 
    {
		int[]a= {5,6,7,8};
		System.out.println(a[3]);
		try
		{
		System.out.println(a[4]);
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Invalid Index ,it should be within array");
		}
	}
}
