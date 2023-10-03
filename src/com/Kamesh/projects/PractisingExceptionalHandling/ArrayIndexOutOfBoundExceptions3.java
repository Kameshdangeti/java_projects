package com.Kamesh.projects.PractisingExceptionalHandling;

public class ArrayIndexOutOfBoundExceptions3 
{
	public static void main(String[] args) 
	{
	     int[]b= {9,10,11,12};
	     System.out.println(b[1]);
	     try
	     {
			System.out.println(b[8]);
		 }
	     catch (ArrayIndexOutOfBoundsException e) 
	     {
			System.out.println("Invalid Index of boundary in array, it should be with in array index");
		}
	}
}
