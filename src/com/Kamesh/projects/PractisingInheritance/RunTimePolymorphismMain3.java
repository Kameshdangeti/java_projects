package com.Kamesh.projects.PractisingInheritance;

public class RunTimePolymorphismMain3 
{
   public static void Animals(RunTimePolymorphism3 r3)
   {
	   r3.noise();
   }
   public static void main(String[] args)
   {
	   Animals ((RunTimePolymorphism3) new Panther());
	   Animals  ((RunTimePolymorphism3) new cat());
   }
}
