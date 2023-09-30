package com.Kamesh.projects.PractisingInheritance;

public class RunTimePolymorphismMain4 
{
   public static void Animals (RunTimePolymorphism4 r4)
   {
	   r4.noise();
   }
   public static void main(String[] args) 
   {
	   Animals ((RunTimePolymorphism4) new Elephant());
	   Animals ((RunTimePolymorphism4) new Rat());
   }
}
