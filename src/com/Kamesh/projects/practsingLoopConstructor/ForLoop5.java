package com.Kamesh.projects.practsingLoopConstructor;

public class ForLoop5 
{
	public static void main(String[] args) 
	{
		int c=10;
		int d=50;
		int sum=0;
		for (int i = c; i <=d; i++) 
		{
			if (i%2==0)
			{
				System.out.println("Even digits between c and d :"+i);
				sum =sum+i;
			}
		}
		System.out.println("Summation of c and d are :"+sum);
	}
}
