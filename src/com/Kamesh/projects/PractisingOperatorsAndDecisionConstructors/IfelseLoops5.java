package com.Kamesh.projects.PractisingOperatorsAndDecisionConstructors;

public class IfelseLoops5 
{
   public static void main(String[] args) 
   {
	int a=10;
	int b=15;
	for (int i = a; i < b; i++)
	{
		if (i%2==0) 
		{
			System.out.println("num which are divisible by 2:"+i);
		}
		else
		{
			System.out.println("num which are not divisible by 2");
		}
	}
   }
}
