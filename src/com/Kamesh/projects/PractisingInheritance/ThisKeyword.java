package com.Kamesh.projects.PractisingInheritance;

public class ThisKeyword
{
   public ThisKeyword()
   {
	   System.out.println("Constructor has No - Arguments.");
   }
   public ThisKeyword(int a)
   {
	   this();
	   System.out.println("Constructor has Integer Arguments.");
	   System.out.println("A :"+a);
   }
   public ThisKeyword(double b)
   {
	   this(10);
	   System.out.println("Constructor has Double Arguments.");
	   System.out.println("B :"+b);
   }  
}
