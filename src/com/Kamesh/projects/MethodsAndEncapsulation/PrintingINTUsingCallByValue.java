//Below we can see the code for the call-by-Values.
package com.Kamesh.projects.MethodsAndEncapsulation;

public class PrintingINTUsingCallByValue 
{
	int change (int b)

	{
		++b;
		return b;
	}
	public static void main(String[] args)
	{
		PrintingINTUsingCallByValue clv=new PrintingINTUsingCallByValue();
		int a=20;
		int c=clv.change(a);
		
		System.out.println("Value of 'a' after passing :"+a);
		System.out.println("Value of 'c' after passing :"+c);
		
	}
}
