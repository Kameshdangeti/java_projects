package com.Kamesh.projects.practisingExceptionalHandling;

public class ArithmeticException3 
{
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