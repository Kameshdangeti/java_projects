package com.Kamesh.projects.PractisingInheritance;

public class ThisKeyword3 
{
  public ThisKeyword3()
  {
	  System.out.println("Constructor has No-Arguments.");
  }
  public ThisKeyword3(int a)
  {
	  this();
	  System.out.println("Constructor has Integer Arguments.");
	  System.out.println("A :"+a);
  }
  public ThisKeyword3(double b)
  {
	  this(30);
	  System.out.println("Constructor has Double Arguments.");
  }
}
