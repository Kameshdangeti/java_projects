package com.Kamesh.projects.PractisingExceptionalHandling;

public class TryCatchBlock 
{
public static void main(String[] args) 
  {
	int a=100;
	int b=0;
	try 
	{
		int c=a/b;
		a=c;    //It is written to fix the warning that is,Variable 'c' is not used anywhere..
	} 
	catch (Exception e)
	{
	   System.out.println("Exception handled");	
	}
	System.out.println("Good morning");
  }
}
