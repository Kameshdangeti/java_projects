package com.Kamesh.projects.PractisingMethodsAndEncapsulation;

public class CallByValue 
{
	int change (int b)
	{
		++b;
		return b;
	}
	public static void main(String[] args)
	{
		CallByValue clv=new CallByValue();
		int a=10;
		int c=clv.change(a);
		System.out.println("Value of A after passing :"+a);
		System.out.println("Value of C after passing :"+c);	
	}
}
