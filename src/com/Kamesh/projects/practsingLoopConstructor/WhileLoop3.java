package com.Kamesh.projects.PractsingLoopConstructor;

public class WhileLoop3 
{
	public static void main(String[] args)
	{
		int n=34298;
		int pro=1;
		while(n!=0)
		{
			int ld=n%10;
			pro=ld*pro;
			n=n/10;
		}
		if (pro%2==0)
		{
			System.out.println("product of digit is even");
		}
		else
		{
			System.out.println("product of digit is odd");
		}
	}
}
