package com.Kamesh.projects.practisingExceptionalHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchedExceptions2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer value :");
		try
		{
			String b=sc.next();
			System.out.println(b);
		} 
		catch (InputMismatchException e) 
		{
			// TODO: handle exception
		}
	}
}
