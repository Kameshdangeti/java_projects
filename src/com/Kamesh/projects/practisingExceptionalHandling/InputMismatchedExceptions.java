package com.Kamesh.projects.practisingExceptionalHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchedExceptions 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer value :");
		try
		{
			String a=sc.next();
			System.out.println(a);
		}
		catch (InputMismatchException e) 
		{
			// TODO: handle exception
		}
	}
}
