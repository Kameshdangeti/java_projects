package com.Kamesh.projects.PractisingJavaBasics;

public class CreatingStaticAndNonStatic5 
{
  public void FamMem()
  {
	  System.out.println("4");
  }
  public void Eldest()
  {
	  System.out.println("Father");
  }
  public static void Cooking()
  {
	  System.out.println("Mother");
  }
  public static void Eldersecgen()
  {
	  System.out.println("Son");
  }
  public void Youngest()
  {
	  System.out.println("Daughter");
  }
  public static void main(String[] args) 
  {
	CreatingStaticAndNonStatic5 c5=new CreatingStaticAndNonStatic5();
	c5.FamMem();
	c5.Eldest();
	Cooking();
	Eldersecgen();
	c5.Youngest();
  }
}
