package com.Kamesh.projects.PractisingExceptionalHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFoundExceptions5
{
	public static void main(String[] args) throws IOException 
	{
		try
		{
		  FileInputStream f4 =	new FileInputStream("mno.java");
		  f4.close();
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("File was not found");
		}
	}
}
