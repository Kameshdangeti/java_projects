package com.Kamesh.projects.PractisingInheritance;

public class CastingMain 
{
    public static void main(String[] args) 
    {
	   Casting c1= new Bus();
	   c1.move();
	   Bus b =(Bus) c1;
	   b.carry();
	   b.move();
	   Casting c2=(Casting) new Lorry();
	   c2.move();
	   Lorry l=(Lorry)c2;
	   l.move();
	   l.trasport();
	}
}
