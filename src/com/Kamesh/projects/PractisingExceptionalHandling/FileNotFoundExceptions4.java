package com.Kamesh.projects.PractisingExceptionalHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundExceptions4 
{
	@SuppressWarnings("resource")
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
