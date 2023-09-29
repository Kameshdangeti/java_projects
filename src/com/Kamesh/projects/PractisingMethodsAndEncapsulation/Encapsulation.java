package com.Kamesh.projects.PractisingMethodsAndEncapsulation;

public class Encapsulation
{
	private String password;
	public void setpassword(String password)
	{
		if (password.length()>=8)
		{
			System.out.println("Your password is set succesfully");
		}
		else
		{
			System.out.println("Invalid password,password must contain 8 characters.");
		}
	}

}
