package com.Kamesh.projects.PractisingMethodsAndEncapsulation;

public class CallByValue4 
{
    int change (int b)
    {
    	b++;
    	return b;
    }
    public static void main(String[] args) 
    {
    	CallByValue4 clv4=new CallByValue4();
    	int a=40;
    	int c=clv4.change(a);
    	System.out.println("Value Of A :"+a);
    	System.out.println("Value Of c :"+c);
	}
}
