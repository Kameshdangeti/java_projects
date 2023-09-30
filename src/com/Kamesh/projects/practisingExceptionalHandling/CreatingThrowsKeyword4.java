package com.Kamesh.projects.practisingExceptionalHandling;

public class CreatingThrowsKeyword4
{
   public static void Area() throws InterruptedException
   {
	   System.out.println("Kphb");
	   Thread.sleep(4000);
	   System.out.println("HitechCity");
   }
   public static void main(String[] args)
   { 
	  try 
	  {
		Area();
	  } 
	  catch (InterruptedException e) 
	  {
		System.out.println("Exception Handled");
	}
   }
}
