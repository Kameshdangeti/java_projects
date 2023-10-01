package com.Kamesh.projects.practisingExceptionalHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundExceptions5
{
	public static void main(String[] args) 
	{
		try
		{
			new FileInputStream("mno.java");
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("File was not found");
		}
	}
}
