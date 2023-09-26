               //2.Checked Exceptions/Compile-Time Exception.

	//InterruptedExceptions.
/*package Exceptions;

public class Interrupted_Exception 
{
 public static void main(String[] args)     //For Normal Conditions.
    {
	System.out.println("Good morning");
	System.out.println("Good Evening");
    }
}*/

/*package Exceptions;

public class Interrupted_Exception 
{
 public static void main(String[] args)       //For Abnormal Conditions.
     {
	System.out.println("Good morning");
	 Thread.sleep(2000);                  //Dangerous Statement.
	System.out.println("Good Evening");
     }
}*/

//And the exception can be handled by using try/catch block as we can see in below code.

package com.Kamesh.projects.Exception;

public class InterruptedExceptions 
{
 public static void main(String[] args) 
 {
	System.out.println("Good morning");
	try 
	{
		Thread.sleep(2000);
	} 
	catch (InterruptedException e)
	{
	}
	System.out.println("Good Evening");
 }
}
