package com.Kamesh.projects.PractisingMethodsAndEncapsulation;

public class OverloadAndArgumentMethodsAndReturnvalueMain2 
{
  public static void main(String[] args) 
  {
	  OverloadAndArgumentMethodsAndReturnvalue2 o3=new OverloadAndArgumentMethodsAndReturnvalue2();
	  int res1=o3.sum(60, 70);
	  OverloadAndArgumentMethodsAndReturnvalue2 o4=new OverloadAndArgumentMethodsAndReturnvalue2();
	  int res2=o4.sum(80, 90, 100);
	  System.out.println("Sum of 2 integers :"+res1);
	  System.out.println("Sum of 3 integers :"+res2);
  }
}
