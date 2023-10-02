package com.Kamesh.projects.PractisingExceptionalHandling;

public class InterruptedExceptions4 
{
   public static void main(String[] args)
   {
	   System.out.println("How are ");
	   try 
	   {
		Thread.sleep(4000);
	   } 
	   catch (InterruptedException e)
	   {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  }
	   System.out.println("You");
   } 
}
