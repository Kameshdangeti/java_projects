//Below we can see the code for the printing the name laptop brand for a particular period of time.

//here we get the exceptions in the 10th line.
/*package Exceptions;

public class Throws_Keyword
{	
public static void laptop_brand()
	{
		System.out.println("Hp");
		Thread.sleep(2000);        //Dangerous Statement 
		System.out.println("Dell");
	}
	public static void main(String[] args) 
	{
	   laptop_brand();	
	}
}*/

//So,it can be handled by using "throws Keyword" is used in method to ignore the exception.
//but still there is an exception so, we use try and catch block to handle that.
package Handling_Exceptions;

public class Throws_Keyword 
{
	public static void laptop_brand() throws InterruptedException
	{
		System.out.println("Hp");
		Thread.sleep(2000);
		System.out.println("Dell");
	}
	public static void main(String[] args) 
	{
	   try 
	   {
		laptop_brand();
	   } 
	   catch (InterruptedException e)
	   {
		   System.out.println("Exception is Handled by using Throws and try and catch blocks.");
	   }	
	}
}
