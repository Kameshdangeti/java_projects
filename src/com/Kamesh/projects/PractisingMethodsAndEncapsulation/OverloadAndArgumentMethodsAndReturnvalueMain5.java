package com.Kamesh.projects.PractisingMethodsAndEncapsulation;

public class OverloadAndArgumentMethodsAndReturnValueMain5
{
	public static void main(String[] args) 
	{
		OverloadAndArgumentMethodsAndReturnValue5 o9 =new OverloadAndArgumentMethodsAndReturnValue5();
		int result=o9.res(210, 220);
		OverloadAndArgumentMethodsAndReturnValue5 o10=new OverloadAndArgumentMethodsAndReturnValue5();
		int result2=o10.res(230, 240, 250);
		System.out.println("Result of 2 integers :"+result);
		System.out.println("Result of 3 integers :"+result2);
	}
}
