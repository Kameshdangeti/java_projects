package com.Kamesh.projects.PractisingExceptionalHandling;

public class TryCatchBlock2 
{
  public static void main(String[] args)
  {
	int a=200;
	int b=0;
	try 
	{
		int c =a/b;
	} 
	catch (Exception e) 
	{
		System.out.println("Exception Handled");
	}
	System.out.println("Good AfterNoon");
  }
}
