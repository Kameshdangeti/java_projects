package com.Kamesh.projects.PractisingInheritance;

public class SuperKeyword4 
{
  public SuperKeyword4()
  {
	  System.out.println("Father is the  2nd in generation in my home");
  }
}
class Grandson extends SuperKeyword4
{
	public Grandson()
	{
		System.out.println("Son is the 3rd in generation in my home");
	}
}