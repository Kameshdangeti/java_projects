package com.Kamesh.projects.OperatorsAndDecisionConstructs;

public class TerenaryConstructs 
{
	public static void main(String[] args)
	{
		
		//code for terenary construct.
		//write a program for to print largest of 3 numbers.
		
		int x=50;
		int y=100;
		int z=150;
		String result=((x>y)&&(y>z))?x+ "is largest"
				      : (y>x)&&(y>z)?y+ "is largest"
				    	  : z+ " is largest";
		
		System.out.println(result);	
	}
}
