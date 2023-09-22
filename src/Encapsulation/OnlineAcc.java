//Below is the code for Encapsulation.
package Encapsulation;

public class OnlineAcc 
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
}
