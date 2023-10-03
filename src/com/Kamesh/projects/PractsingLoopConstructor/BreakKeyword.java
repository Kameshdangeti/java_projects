package com.Kamesh.projects.PractsingLoopConstructor;

public class BreakKeyword
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <=3; i++) 
		{
			for (int j = 1; j <=3; j++)
			{
				if (i==3||j==3)
				{
					break;
				}
				System.out.println("Break values of i are :"+i);
	            System.out.println("Break values of j are :"+j);
			}
		}
	}
}
