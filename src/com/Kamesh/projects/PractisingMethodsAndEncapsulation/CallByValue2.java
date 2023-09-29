package com.Kamesh.projects.PractisingMethodsAndEncapsulation;

public class CallByValue2 
{
	int change (int b)
	{
		b++;
		return b;
	}
	public static void main(String[] args)
	{
		CallByValue2 clv2=new CallByValue2();
		int a=20;
		int c=clv2.change(a);
		System.out.println("Value of A:"+a);
		System.out.println("Value of C:"+c);
	}
}
