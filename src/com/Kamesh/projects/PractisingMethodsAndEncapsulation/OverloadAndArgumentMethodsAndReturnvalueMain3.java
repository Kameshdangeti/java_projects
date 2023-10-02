package com.Kamesh.projects.PractisingMethodsAndEncapsulation;

public class OverloadAndArgumentMethodsAndReturnValueMain3
{
   public static void main(String[] args)
   {
	   OverloadAndArgumentMethodsAndReturnValue3 o5=new OverloadAndArgumentMethodsAndReturnValue3();
	   int res1=o5.op(110, 120);
	   OverloadAndArgumentMethodsAndReturnValue3 o6=new OverloadAndArgumentMethodsAndReturnValue3();
	   int res2=o6.op(130, 140, 150);
	   System.out.println("Result of 2 Integers :"+res1);
	   System.out.println("Result of 3 Integers :"+res2);
   }
}
