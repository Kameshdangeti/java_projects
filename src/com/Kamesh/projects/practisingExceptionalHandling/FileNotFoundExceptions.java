package com.Kamesh.projects.practisingExceptionalHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundExceptions 
{
	public static void main(String[] args)
	{
	    try 
	    {
			new FileInputStream("abcd.java");
		} 
	    catch (FileNotFoundException e) 
	    {
			System.out.println("File was not found");
		}	
	}
}
