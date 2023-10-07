//Below we seen the code for creation and use of While loop.
//Write a program for to check whether the product of the digits is Even or Odd by using While Loop.
package com.Kamesh.projects.LoopingConstructor;

public class ProdOfNUsingWhileloop
{
	public static void main(String[] args) 
	{
		int n=2468;  
		int pro=1;                                 //Here "pro" means product.
		while(n!=0)
		{ 
			int ld = n%10;                         //Here "ld" means LastDigit.
			pro =pro*ld;
			n=n/10;
		}
		if (pro%2==0) 
		{
			System.out.println("Product of digit is even");
		}
		else 
		{
			System.out.println("Product of digit is odd");
		}
	}
}
