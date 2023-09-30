package com.Kamesh.projects.PractisingInheritance;

public class CompileTimePolymorphism5 
{
	 public static void mod(int x,int y)
	   {
		   System.out.println(x%y);
	   }
	   public static void div(int x,double y)
	   {
		   System.out.println(y%x);
	   }
	   public static void div(int x,double y, double z)
	   {
		   System.out.println(x%z%y);
	   }
}
