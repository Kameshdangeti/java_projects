package com.Kamesh.projects.PractisingExceptionalHandling;

public class TryCatchBlock5 
{
  public static void main(String[] args) 
  {
	 int a=500;
	 int b=0;
	 try 
	 {
		int c=a/b;
	 } 
	 catch (Exception e)
	 {
		System.out.println("Exception handled");
	 }
	 System.out.println("Good Morning");
  }
}
