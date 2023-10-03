package com.Kamesh.projects.PractisingMethodsAndEncapsulation;

public class Encapsulation3
{
	@SuppressWarnings("unused")
	private String password;
	public void setpassword(String password)
	{
		if (password.length()>=8)
		{
			System.out.println("Password is set successfully");
		}
		else
		{
			System.out.println("Invalid password");
		}
	}
}
