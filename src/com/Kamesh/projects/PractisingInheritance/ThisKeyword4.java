package com.Kamesh.projects.PractisingInheritance;

public class ThisKeyword4 
{
  public ThisKeyword4()
  {
	  System.out.println("No-Arguments are there in this constructor.");
  }
  public ThisKeyword4(int a)
  {
	  this();
	  System.out.println("This has Integer Constructor.");
	  System.out.println("A :"+a);
  }
  public ThisKeyword4(double b)
  {
	  this(10);
	  System.out.println("This has Double Construcor.");
	  System.out.println("B :"+b);
  }
}
