package com.Kamesh.projects.PractisingInheritance;

public class CompileTimePolymorphism 
{
  public static void sum(int i,int j)
  {
	  System.out.println(i+j);
  }
  public static void sum(int i,double j)
  {
	  System.out.println(j+i);
  }
  public static void sum(int i,int j,double k)
  {
	  System.out.println(k+j+i);
  }
}
