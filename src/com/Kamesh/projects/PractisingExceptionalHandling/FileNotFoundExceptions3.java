package com.Kamesh.projects.PractisingExceptionalHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundExceptions3
{
	public static void main(String[] args) 
	{
		try 
		{
			new FileInputStream("ghi.java");
		} 
		catch (FileNotFoundException e)
		{
			System.out.println("File was not found");
		}
	}
}
