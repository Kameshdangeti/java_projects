package com.Kamesh.projects.PractisingMethodsAndEncapsulation;

public class Encapsulation2 
{
   @SuppressWarnings("unused")
private String password;
   public void setpassword(String password)
   {
	   if (password.length()>=8)
	   {
		  System.out.println("Your password is set successfully");
	   }
	   else
	   {
		   System.out.println("Invalid password");
	   }
   }
}
