package com.Kamesh.projects.PractisingMethodsAndEncapsulation;

public class CallByValue5
{
	int change (int b)
	{
		b++;
		return b;
	}
	public static void main(String[] args) 
	{
		CallByValue5 clv5=new CallByValue5();
		int a=50;
		int c=clv5.change(a);
		System.out.println("Value Of A :"+a);
		System.out.println("Value Of C :"+c);
	}
}
