package com.Kamesh.projects.PractisingOperatorsAndDecisionConstructors;

import java.util.Scanner;

public class SwitchStatements5
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		int days;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number from  1-7 to know the day");
		days=sc.nextInt();
		switch (days) 
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
			
		default:
			System.out.println("Invalid Numbers");
			break;
		}
	}
}
