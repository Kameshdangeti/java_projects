package com.Kamesh.projects.PractisingExceptionalHandling;

public class TryCatchBlock 
{
  @SuppressWarnings("unused")
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
	   System.out.println("Exception handled");	
	}
	System.out.println("Good morning");
  }
}
