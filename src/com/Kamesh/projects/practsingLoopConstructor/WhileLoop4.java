package com.Kamesh.projects.practsingLoopConstructor;

public class WhileLoop4 
{
	public static void main(String[] args) 
	{
	   int n=345645;
	   int pro=1;
	   while(n!=0)
	   {
		   int ld=n%10;
		   pro=pro*ld;
		   n=n/10;
	   }
	   if (pro%2==0)
	   {
		System.out.println("Product is even");
	   }  
	   else
	   {
		   System.out.println("product is odd");
	   }
	}
}
