package com.Kamesh.projects.PractisingMethodsAndEncapsulation;

public class Encapsulation5
{
	@SuppressWarnings("unused")
	private String password;
	public void setpassword(String password)
	{
		if (password.length()>=8)
		{
			System.out.println("Password is set succesfully");
		}
		else
		{
			System.out.println("Invalid password");
		}
	}
}
