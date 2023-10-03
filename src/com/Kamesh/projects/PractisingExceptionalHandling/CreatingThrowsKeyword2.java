package com.Kamesh.projects.PractisingExceptionalHandling;

public class CreatingThrowsKeyword2
{
   public static void Mobilename() throws InterruptedException
   {
	   System.out.println("Realme");
	   Thread.sleep(2000);
	   System.out.println("Oppo");
   }
   public static void main(String[] args) 
   {
	  try 
	  {
		Mobilename();
	  } 
	  catch (InterruptedException e) 
	  {
		System.out.println("Exception Handled");
	  }
   }
}
