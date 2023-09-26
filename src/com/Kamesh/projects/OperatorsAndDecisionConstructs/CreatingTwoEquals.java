//Inthe below we can see the code for .equals() and == 
//== is used to compare  memeory  .
//equals() is used to compare content of object
//and it will return the ouput in boolean (true/false).
package com.Kamesh.projects.OperatorsAndDecisionConstructs;

public class CreatingTwoEquals 
{
	public static void main(String[] args) 
	{
		String s1="Kamesh";
		String s2="Lucky";
		String s3="Kamesh";
		
		System.out.println("The statement is :"+(s1.equals(s3)));     //.equals()
		System.out.println("The statement is :"+(s1 == s3));          //==
		System.out.println("The statement is :"+(s1.equals(s2)));
	}

}
