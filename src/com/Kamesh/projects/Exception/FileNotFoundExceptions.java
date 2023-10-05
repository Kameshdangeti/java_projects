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

package com.Kamesh.projects.Exception;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFoundExceptions 
{
	
	public static void main(String[] args) throws IOException
	{
		try
		{
			 FileInputStream  f1 = new FileInputStream("Abcd.java");
			 f1.close();
		} 
		catch (FileNotFoundException e)
		{
			System.out.println("File Not Found");
		}
	}
}
