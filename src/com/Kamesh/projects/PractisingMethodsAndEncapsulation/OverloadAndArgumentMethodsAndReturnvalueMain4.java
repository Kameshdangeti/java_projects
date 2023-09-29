package com.Kamesh.projects.PractisingMethodsAndEncapsulation;

public class OverloadAndArgumentMethodsAndReturnvalueMain4 
{
  public static void main(String[] args)
  {
	OverloadAndArgumentMethodsAndReturnvalue4 o7=new OverloadAndArgumentMethodsAndReturnvalue4();
	int result1=o7.sum(160, 170);
	OverloadAndArgumentMethodsAndReturnvalue4 o8 =new OverloadAndArgumentMethodsAndReturnvalue4();
	int result2=o8.sum(180, 190, 200);
	System.out.println("Result of 2 Integers:"+result1);
	System.out.println("Result of 2 Integers:"+result2);
  }
}
