package com.Kamesh.projects.PractisingExceptionalHandling;

public class ArithmeticException3 
{
   @SuppressWarnings("unused")
public static void main(String[] args) 
   {
	  int a=300;
	  int b=0;
	  try 
	  {
		int c=a/b;
	  } 
	  catch (Exception e)
	  {
		System.out.println("Exception Handled");
	  }
	  System.out.println("HOLA");
   }
}
