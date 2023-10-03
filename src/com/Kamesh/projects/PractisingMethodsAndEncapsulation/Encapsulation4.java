package com.Kamesh.projects.PractisingMethodsAndEncapsulation;

public class Encapsulation4 
{
    @SuppressWarnings("unused")
	private String password;
    public void setpassword(String password)
    {
    	if (password.length()>=8)
    	{
			System.out.println("The password is set successfully");
		}
    	else
    	{
    		System.out.println("Invalid pasword");
    	}
    }
}
