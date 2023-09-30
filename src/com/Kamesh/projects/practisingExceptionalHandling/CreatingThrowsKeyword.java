package com.Kamesh.projects.practisingExceptionalHandling;

public class CreatingThrowsKeyword
{
   public static void laptopname() throws InterruptedException
   {
	   System.out.println("Dell");
	   Thread.sleep(1000);
	   System.out.println("Hp");
   }
   public static void main(String[] args) 
   {
	  try 
	  {
		laptopname();
	  }
	  catch (InterruptedException e)
	  {
		System.out.println("Exception Handled");
	  }
   }
}
