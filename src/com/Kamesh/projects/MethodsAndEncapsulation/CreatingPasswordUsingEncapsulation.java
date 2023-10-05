//Below we written the code for second example of Encapsulation.
//And the main method of this code is written seperately i.e., "CreatingPasswordUsingEncapsulationMain.java".
package com.Kamesh.projects.MethodsAndEncapsulation;

public class CreatingPasswordUsingEncapsulation 
{
	private String password;
	public void setpasssword(String password)
	{
		if (password.length()>=8)
		{
			System.out.println("Password is set Succesfully");
		}
		else 
		{
		    System.out.println("Invalid password;Password should be minimum 8 Characters..");
		}
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
}
