package com.Kamesh.projects.PractisingInheritance;

public class CastingMain3
{
	 public static void main(String[] args) 
	    {
		   Casting c5= new Bus2();
		   c5.move();
		   Bus2 b =(Bus2) c5;
		   b.carry();
		   b.move();
		   Casting c6=(Casting) new Lorry2();
		   c6.move();
		   Lorry2 l=(Lorry2)c6;
		   l.move();
		   l.trasport();
		}
}
