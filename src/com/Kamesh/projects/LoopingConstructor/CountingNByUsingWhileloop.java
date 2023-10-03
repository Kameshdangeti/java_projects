//Below we can see the code for creation and usse of While loop.
//Write a Program for checking whether the pincode is valid or not.
package com.Kamesh.projects.LoopingConstructor;

public class CountingNByUsingWhileloop 
{
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		int n=533401;
		int count =0;
		while (n!=0) 
		{
           int ld=n%10;
           count++;
           n=n/10;
		}
		if (count==6)
		{
			System.out.println("The pin no is valid");
		}
		else
		{
			System.out.println("The pin no is not valid");
		}
	}

}
