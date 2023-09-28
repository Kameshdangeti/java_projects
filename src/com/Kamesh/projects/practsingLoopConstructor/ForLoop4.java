package com.Kamesh.projects.practsingLoopConstructor;

public class ForLoop4
{
	public static void main(String[] args) 
	{
		int x=10;
		int y=40;
		int sum=0;
		for (int i = x; i <=y; i++) 
		{
			if (i%2==0)
			{
				System.out.println("Even digits between x and y :"+i);
				sum=sum+i;
			}
		}
		System.out.println("Summation of x and y are :"+sum);
	}
}
