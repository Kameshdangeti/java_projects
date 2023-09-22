    //FileNotFoundException
/*package Exceptions;

import java.io.FileInputStream;


public class File_Not_Found_Exceptions 
{
	public static void main(String[] args)
	{
		new FileInputStream("abcd.java");      //Dangerous Statement.
	}
}*/

//And the exception can be handled by using try/catch block as we can see in below code.

package Handling_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class File_Not_Found_Exceptions 
{
	public static void main(String[] args)
	{
		try
		{
			new FileInputStream("abcd.java");
		} 
		catch (FileNotFoundException e)
		{
			System.out.println("File Not Found");
		}
	}
}
