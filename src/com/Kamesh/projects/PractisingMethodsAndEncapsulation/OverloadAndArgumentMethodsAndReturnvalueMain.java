package com.Kamesh.projects.PractisingMethodsAndEncapsulation;

public class OverloadAndArgumentMethodsAndReturnvalueMain 
{
	public static void main(String[] args)
	{
		OverloadAndArgumentMethodsAndReturnvalue o1=new OverloadAndArgumentMethodsAndReturnvalue();
		int result1=o1.add(10, 20);
		OverloadAndArgumentMethodsAndReturnvalue o2=new OverloadAndArgumentMethodsAndReturnvalue();
		int result2=o2.add(30,40, 50);
		System.out.println("Addition of 2 integers :"+result1);
		System.out.println("Addition of 3 integers :"+result2);
	}
}
