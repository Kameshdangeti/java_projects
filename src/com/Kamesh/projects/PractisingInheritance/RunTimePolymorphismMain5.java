package com.Kamesh.projects.PractisingInheritance;

public class RunTimePolymorphismMain5
{
   public static void Animal(RunTimePolymorphism5 r5)
   {
	   r5.noise();
   }
   public static void main(String[] args) 
   {
	  Animal ((RunTimePolymorphism5) new Rhino());
	  Animal ((RunTimePolymorphism5) new Snake());
   }
}
