package com.Kamesh.projects.PractisingExceptionalHandling;

import java.util.Scanner;

public class InputMismatchedExceptions4
{
   public static void main(String[] args) 
   {
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the integer value :");
	  try 
	  {
		 String d=s.next();
		 System.out.println(d);
	  } 
	  catch (Exception e) 
	  {
		// TODO: handle exception
	  }
   }
}
