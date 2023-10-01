package com.Kamesh.projects.practisingExceptionalHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundExceptions4 
{
	public static void main(String[] args)
	{
		try 
		{
			new FileInputStream("jkl.java");
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("File was not found.");
		}
		
	}
}
