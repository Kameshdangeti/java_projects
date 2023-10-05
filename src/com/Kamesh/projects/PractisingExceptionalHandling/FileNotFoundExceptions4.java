package com.Kamesh.projects.PractisingExceptionalHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFoundExceptions4 
{
	public static void main(String[] args) throws IOException
	{
		try 
		{
		   FileInputStream f5=  new FileInputStream("jkl.java");
		   f5.close();
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("File was not found.");
		}
		
	}
}
