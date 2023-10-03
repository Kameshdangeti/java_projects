package com.Kamesh.projects.PractisingExceptionalHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchedExceptions3
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer value :");
		try 
		{
			String c=sc.next();
			System.out.println(c);
		} 
		catch (InputMismatchException e) 
		{
			// TODO: handle exception
		}
	}
}
