//Below we can see the code for Try/Catch Block .
//And not only that here we can see how exception alters the normal program flow.

//Basic code written in the below but while executing it we get exception.
/*package Exceptions;

public class Try_catch_Block 
{
	public static void main(String[] args) 
	{
		int a=200;                             code without try/Catch
		int b=0;
		int c=a/b;                       //Dangerous Statement.
		System.out.println(c);
		System.out.println("Good Morning");
	}

}*/

//So,to handle that we make Try and Catch Block .
//Here try block surrounded by "{}" will holds dangerous statement to complie.
//catch block states that whicj type of exception and it will provide rest of the code.
package com.Kamesh.projects.Exception;

public class Dividing2IntUsingTryCatchBlock 
{
	public static void main(String[] args) 
	{
		int a=200;
		int b=0;
		try
		{
			int c=a/b;
			a=c;    //It is written to fix the warning that is,Variable 'c' is not used.
		}
		catch(ArithmeticException c)
		{
		System.out.println("Exception is Handled.");
		}
		System.out.println("Good Morning");
	}

}
