package com.Kamesh.projects.PractsingLoopConstructor;

public class ForLoop2 
{
	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		int sum=0;
		for (int i = a; i <=b; i++) 
		{
		  if (i%2==0) 
		  {
			  System.out.println("The even no between a and b"+i);
			  sum =sum+i;
		  }	
		}
		System.out.println("Summation of the a and b are:"+sum);
	}
}
