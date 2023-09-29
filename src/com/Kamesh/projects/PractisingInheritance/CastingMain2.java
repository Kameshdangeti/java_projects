package com.Kamesh.projects.PractisingInheritance;

public class CastingMain2 
{
	 public static void main(String[] args) 
	    {
		   Casting c3= new Bus1();
		   c3.move();
		   Bus1 b =(Bus1) c3;
		   b.carry();
		   b.move();
		   Casting c4=(Casting) new Lorry1();
		   c4.move();
		   Lorry1 l=(Lorry1)c4;
		   l.move();
		   l.trasport();
		}
}
