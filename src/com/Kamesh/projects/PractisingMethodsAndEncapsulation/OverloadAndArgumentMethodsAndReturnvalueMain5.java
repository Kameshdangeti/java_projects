package com.Kamesh.projects.PractisingMethodsAndEncapsulation;

public class OverloadAndArgumentMethodsAndReturnvalueMain5
{
	public static void main(String[] args) 
	{
		OverloadAndArgumentMethodsAndReturnvalue5 o9 =new OverloadAndArgumentMethodsAndReturnvalue5();
		int result=o9.res(210, 220);
		OverloadAndArgumentMethodsAndReturnvalue5 o10=new OverloadAndArgumentMethodsAndReturnvalue5();
		int result2=o10.res(230, 240, 250);
		System.out.println("Result of 2 integers :"+result);
		System.out.println("Result of 3 integers :"+result2);
	}
}
