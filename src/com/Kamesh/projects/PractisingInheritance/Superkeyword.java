package com.Kamesh.projects.PractisingInheritance;

public class Superkeyword 
{
  public Superkeyword()
  {
	  System.out.println("Father is elder in the family");
  }
}
class kids extends Superkeyword
{
	public kids()
	{
		super();
		System.out.println("Son is the Eldest in the kids");
	}
}